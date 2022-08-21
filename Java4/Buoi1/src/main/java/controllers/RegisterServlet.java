package controllers;

import Bean.User;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("views/register.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        try {
            User user = new User();
            BeanUtils.populate(user, request.getParameterMap());
            request.setAttribute("user", user);
        } catch (Exception e) {
            e.printStackTrace();
        }

        request.getRequestDispatcher("views/register.jsp").forward(request, response);
    }
}
