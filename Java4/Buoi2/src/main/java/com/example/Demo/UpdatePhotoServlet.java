package com.example.Demo;

import Entity.Student;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@MultipartConfig
@WebServlet("/update")
public class UpdatePhotoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("views/update.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Part part = request.getPart("photo");
        String realPath = request.getServletContext().getRealPath("/images");

        if (!Files.exists(Paths.get(realPath))) {
            Files.createDirectory(Paths.get(realPath));
        }

        String fileName = Paths.get(part.getSubmittedFileName()).getFileName().toString();
        part.write(realPath + "/" + fileName);
        request.setAttribute("srcImg", "images/" + fileName);
        request.getRequestDispatcher("views/update.jsp").forward(request, response);
    }
}
