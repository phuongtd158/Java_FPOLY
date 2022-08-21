package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("views/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        System.out.println(email + "-" + password);
        if (email.trim().equals("phuongsky1508@gmail.com") && password.trim().equals("123")) {
            request.setAttribute("name", "Tran Duc Phuong");
            request.getRequestDispatcher("views/index.jsp").forward(request, response);
        }
    }
}
