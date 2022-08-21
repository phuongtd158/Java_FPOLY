package com.example.Demo;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(urlPatterns = {"/TamGiac/ChuVi", "/TamGiac/DienTich"})
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/views/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        String url = req.getParameter("url");
        float a = Float.parseFloat(req.getParameter("a"));
        float b = Float.parseFloat(req.getParameter("b"));
        float c = Float.parseFloat(req.getParameter("b"));

        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            if (uri.contains(url)) {
                float dienTich = tinhDienTich(a, b, c);
                req.setAttribute("mess", "Dien tich tam giac la: " + dienTich);
            } else {
                float chuVi = tinhChuVi(a, b, c);
                req.setAttribute("mess", "Chu vi cua tam giac la: " + chuVi);
            }
        } else {
            req.setAttribute("mess", "Canh khong hop le");
        }

        req.getRequestDispatcher("/views/index.jsp").forward(req, resp);
    }

    private float tinhChuVi(float a, float b, float c) {
        return a + b + c;
    }

    private float tinhDienTich(float a, float b, float c) {
        float s = (a + b + c) / 2;
        return (float) Math.sqrt(s * (s - a) + (s - b) * (s - c));
    }
}