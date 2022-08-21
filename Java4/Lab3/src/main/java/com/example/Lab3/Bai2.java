package com.example.Lab3;

import Bean.UserBean;
import org.apache.commons.beanutils.*;
import org.apache.commons.beanutils.converters.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

@MultipartConfig
@WebServlet("/bai2")
public class Bai2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("views/bai2.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        try {
            DateTimeConverter dtc = new DateConverter(new Date());
            dtc.setPattern("dd/MM/yyyy");
            ConvertUtils.register(dtc, Date.class);

            UserBean user = new UserBean();
            BeanUtils.populate(user, request.getParameterMap());

            String uploadFolder = request.getServletContext().getRealPath("/upload");
            Path uploadPath = Paths.get(uploadFolder);

            if (!Files.exists(uploadPath)) {
                Files.createDirectory(uploadPath);
            }

            Part part = request.getPart("image");
            String imageFileName = Paths.get(part.getSubmittedFileName()).getFileName().toString();

            part.write(Paths.get(uploadPath.toString(), imageFileName).toString());

            String[] hobbies = request.getParameterValues("hobbies");
            StringBuilder builder = new StringBuilder();

            for (String hobby : hobbies) {
                builder.append(hobby).append(", ");
            }

            user.setHobbies(builder.length() > 0 ? builder.substring(0, builder.length() - 2) : "");
            user.setImage(imageFileName);

            request.setAttribute("user", user);
            request.setAttribute("mess", "Upload successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("views/bai2.jsp").forward(request, response);
    }
}
