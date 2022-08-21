package com.example.Demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("views/register.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String name = request.getParameter("name");
        String password = request.getParameter("password");
        boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
        String married = request.getParameter("married");
        String country = request.getParameter("country");
        String[] hobbies = request.getParameterValues("hobbies");
        String notes = request.getParameter("note");

        request.setAttribute("name", name);
        request.setAttribute("password", password);
        request.setAttribute("gender", gender == true ? "Nam" : "Nữ");
        request.setAttribute("country", country);
        request.setAttribute("married", married == null ? "Chưa kết hôn" : "Đã kết hôn");
        if (hobbies != null) {
            String hb = String.join(", ", hobbies);
            request.setAttribute("hobbies", hb);
        }
        request.setAttribute("notes", notes);

//        Part photo = request.getPart("photo");
//        if (photo != null) {
//            String path = "/static/files" + photo.getSubmittedFileName();
//            String fileName = request.getServletContext().getRealPath(path);
//            photo.write(fileName);
//            System.out.println(photo + " - " + path + " - " + fileName);
//        }
//
//        Part part = request.getPart("photo"); // Part luu thong tin nguoi dung update toi server
//        String realPart = request.getServletContext().getRealPath("/photo"); // Lay duong dan
//        String fileName = Path.of(part.getSubmittedFileName()).getFileName().toString(); // Lay ten file
//
//        if (!Files.exists(Path.of(realPart))) { // Kiem tra su ton tai cua duong dan
//            Files.createDirectory(Path.of(realPart));
//        }
//        part.write(realPart + "/" + fileName);

        request.getRequestDispatcher("views/register.jsp").forward(request, response);
    }
}
