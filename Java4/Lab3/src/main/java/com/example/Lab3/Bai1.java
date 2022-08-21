package com.example.Lab3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@MultipartConfig
@WebServlet("/bai1")
public class Bai1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("views/bai1.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String uploadFolder = req.getServletContext().getRealPath("/upload");
        Path uploadPath = Paths.get(uploadFolder);

        if (!Files.exists(uploadPath)) {
            Files.createDirectory(uploadPath);
        }

        Part imagePart = req.getPart("image");
        Part docPart = req.getPart("document");

        String imageFileName = Paths.get(imagePart.getSubmittedFileName()).getFileName().toString();
        String docFileName = Paths.get(docPart.getSubmittedFileName()).getFileName().toString();

        imagePart.write(Paths.get(uploadPath.toString(), imageFileName).toString());
        docPart.write(Paths.get(uploadPath.toString(), docFileName).toString());

        req.setAttribute("image", imageFileName);
        req.setAttribute("doc", docFileName);
        req.setAttribute("mess", "Update successfully");

        req.getRequestDispatcher("views/bai1.jsp").forward(req, resp);
    }
}