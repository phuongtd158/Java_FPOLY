package com.example.Demo;

import Utils.CookieUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = CookieUtils.getCookie("username", request);

        if (username != null && !username.equals("")) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            request.getRequestDispatcher("views/home.jsp").forward(request, response);
            return;
        }

        request.getRequestDispatcher("views/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean remember = "true".equals(request.getParameter("remember"));


        if (username.trim().equals("phuongtd") && password.trim().equals("123")) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);

            if (remember) {
                CookieUtils.addCookie("username", username, 24, response);
            } else {
                CookieUtils.addCookie("username", null, 0, response);
            }
            System.out.println(remember);

            request.getRequestDispatcher("views/home.jsp").forward(request, response);
            return;
        }
        request.getRequestDispatcher("views/login.jsp").forward(request, response);
    }
}
