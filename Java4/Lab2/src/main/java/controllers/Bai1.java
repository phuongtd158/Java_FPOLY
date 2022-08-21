package controllers;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(urlPatterns = {"/Bai1"})
public class Bai1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("views/bai1.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        double a = Double.parseDouble(request.getParameter("a"));
        double b = Double.parseDouble(request.getParameter("b"));
        double c = Double.parseDouble(request.getParameter("c"));

        if (a < b + c && b < a + c && c < a + b) {
            String uri = request.getParameter("uri");
            double chuVi = a + b + c;
            if (uri.contains("chuvi")) {
                request.setAttribute("mess", "Chu vi la: " + chuVi);
            } else {
                double dienTich = Math.sqrt(chuVi * (chuVi - a) * (chuVi - b) * (chuVi - c));
                request.setAttribute("mess", "Dien tich la: " + dienTich);
            }
        } else {
            request.setAttribute("mess", "Khong phai tam giac");
        }
        request.getRequestDispatcher("views/bai1.jsp").forward(request, response);
    }
}