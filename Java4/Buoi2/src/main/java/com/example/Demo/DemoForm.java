package com.example.Demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/form")
public class DemoForm extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("views/demo-form.html").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            String name = request.getParameter("userName");
            String[] hobbies = request.getParameterValues("hobbies");
            String country = request.getParameter("country");

            out.println("<h1>Name: " + name + "</h1>");
            StringBuilder builder = new StringBuilder();
            out.println("<h1>Hobbies:");
            for (String hobbie :
                    hobbies) {
                builder.append(hobbie).append(", ");
            }
//            String rs = String.join(", ", hobbies);
            out.println(builder.length() > 0 ? builder.substring(0, builder.length() - 2).toString() : "");
            out.println("</h1>");
            out.println("<h1>Country: " + country + "</h1>");

        }
        request.getRequestDispatcher("views/demo-form.html").forward(request, response);
    }
}
