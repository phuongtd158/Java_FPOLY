package controllers;

import dao.UserDAO;
import entity.User;
import utils.CookieUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(urlPatterns = {
        "/account/sign-in",
        "/account/sign-up",
        "/account/sign-out",
        "/account/forgot-password",
        "/account/change-password",
        "/account/edit-profile"
})
public class AccountServlet extends HttpServlet {

    UserDAO dao = new UserDAO();
    boolean isAdmin = false;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();

        if (uri.contains("sign-in")) {
            doGetLogin(request, response);
            return;
        } else if (uri.contains("sign-out")) {
            logout(request, response);
            return;
        } else if (uri.contains("sign-up")) {
            doGetSignUp(request, response);
            return;
        } else if (uri.contains("edit-profile")) {
            request.getRequestDispatcher("/views/edit-profile.jsp").forward(request, response);
            return;
        } else if (uri.contains("change-password")) {
            request.getRequestDispatcher("/views/change-password.jsp").forward(request, response);
            return;
        }
        request.getRequestDispatcher("/views/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String uri = request.getRequestURI();
        if (uri.contains("sign-in")) {
            doPostLogin(request, response);
            return;
        } else if (uri.contains("sign-up")) {
            doPostSignUp(request, response);
            return;
        }
        request.getRequestDispatcher("/views/login.jsp").forward(request, response);
    }

    private void doGetLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId = CookieUtils.readCookies("userId", request);
        if (userId != null && !userId.equals("")) {
            HttpSession session = request.getSession();
            session.setAttribute("userId", userId);
            if (!isAdmin) {
                request.getRequestDispatcher("/views/edit-profile.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("/views/admin/index.jsp").forward(request, response);
            }
        }
    }

    private void doPostLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId = request.getParameter("userId");
        String password = request.getParameter("password");
        String remember = request.getParameter("remember");

        User user = dao.findByUserIdAndPassword(userId, password);

        if (user != null) {
            HttpSession session = request.getSession();
            session.setAttribute("userId", userId);
            session.setAttribute("user", user);

            if (remember != null) {
                CookieUtils.addCookies("userId", userId, 24, response);
            } else {
                CookieUtils.addCookies("userId", null, 0, response);
            }
            if (user.getAdmin()) {
                isAdmin = true;
                request.getRequestDispatcher("/views/admin/index.jsp").forward(request, response);
                return;
            }

            request.getRequestDispatcher("/views/account.jsp").forward(request, response);
            request.setAttribute("mess", "Login successfully");
        } else {
            request.setAttribute("error", "Login error");
            request.getRequestDispatcher("/views/login.jsp").forward(request, response);
        }
    }

    public void doGetSignUp(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/views/sign-up.jsp").forward(request, response);
    }

    public void doPostSignUp(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/views/sign-up.jsp").forward(request, response);
    }

    private void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.invalidate();
        CookieUtils.addCookies("userId", null, 0, response);

        request.getRequestDispatcher("/views/login.jsp").forward(request, response);
    }

}
