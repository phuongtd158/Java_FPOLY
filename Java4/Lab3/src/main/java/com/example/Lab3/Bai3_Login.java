package com.example.Lab3;

import Utils.CookieUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/login")
public class Bai3_Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = CookieUtils.readCookies("username", request);

        if (username != null && !username.trim().equals("")) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            request.getRequestDispatcher("views/bai3_welcome_form.jsp").forward(request, response);
            return;
        }

        request.getRequestDispatcher("views/bai3_login_form.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String remember = request.getParameter("remember");

            if (username.trim().equals("phuongtd") && password.trim().equals("123")) {
                HttpSession session = request.getSession();
                session.setAttribute("username", username);
                if (remember != null) {
                    CookieUtils.addCookies("username", "phuongtd", 24, response);
                } else {
                    CookieUtils.addCookies("username", null, 0, response);
                }
                request.getRequestDispatcher("views/bai3_welcome_form.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("views/bai3_login_form.jsp").forward(request, response);
            }
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("views/bai3_login_form.jsp").forward(request, response);
    }
}
