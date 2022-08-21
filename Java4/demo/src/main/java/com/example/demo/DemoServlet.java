package com.example.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/a")
public class DemoServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int a = Integer.parseInt(request.getParameter("a"));
        int b = Integer.parseInt(request.getParameter("b"));

        int result = a + b;
        request.setAttribute("a", a);
        request.setAttribute("b", b);
        request.setAttribute("result", result);

        request.getRequestDispatcher("calculate.jsp").forward(request, response);

//        response.getWriter().println("Sum of " + a + " and" + b + " is: " + result);
    }
}
