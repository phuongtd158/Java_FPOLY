package com.example.Lab4;

import Entity.Item;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/bai1")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        List<Item> list = new ArrayList<>();
        list.add(new Item("Sản phẩm 1", "khabanh.png", 10.1, 0.2));
        list.add(new Item("Sản phẩm 3", "khabanh.png", 100.9, 0.3));
        list.add(new Item("Sản phẩm 4", "khabanh.png", 101.2, 0.1));
        list.add(new Item("Sản phẩm 5", "khabanh.png", 50.1, 0.0));
        list.add(new Item("Sản phẩm 6", "khabanh.png", 102.1, 0.6));
        list.add(new Item("Sản phẩm 2", "khabanh.png", 70.4, 0.2));

        req.setAttribute("list", list);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}