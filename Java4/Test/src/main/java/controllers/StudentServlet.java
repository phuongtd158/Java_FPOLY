package controllers;

import entity.Students;
import org.apache.commons.beanutils.BeanUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/index")
public class StudentServlet extends HttpServlet {

    List<Students> list = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            response.setCharacterEncoding("UTF-8");
            request.setCharacterEncoding("UTF-8");

            list.clear();

            list.add(new Students("PH13747", "Trần Đức Phương", "true", "UDPM", "0385606568", "phuongtdph13747@fpt.edu.vn", new Date()));
            list.add(new Students("PH13748", "Lương Hoài Nam", "false", "UDPM", "0385606568", "phuongtdph13747@fpt.edu.vn", new Date()));
            list.add(new Students("PH13749", "Hạ Quyết Chiến", "true", "UDPM", "0385606568", "phuongtdph13747@fpt.edu.vn", new Date()));
            list.add(new Students("PH13750", "Phạm Tú ANh", "false", "UDPM", "0385606568", "phuongtdph13747@fpt.edu.vn", new Date()));
            list.add(new Students("PH13751", "Lê Minh Thụy", "true", "UDPM", "0385606568", "phuongtdph13747@fpt.edu.vn", new Date()));

            request.setAttribute("students", list);
            request.setAttribute("form", "/views/form.jsp");
            request.setAttribute("table", "/views/table.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            Students students = new Students();
            Date date = new Date();
            students.setThoiGianTao(date);
            BeanUtils.populate(students, request.getParameterMap());

            list.add(students);
            System.out.println(students.toString());

            request.setAttribute("students", list);
            request.setAttribute("mess", "Thêm thành công");
            request.setAttribute("form", "/views/form.jsp");
            request.setAttribute("table", "/views/table.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("error", "Thêm thất bại");
        }

        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}