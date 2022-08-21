package controllers;

import entity.User;

import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/Bai2")
public class Bai2_Bai3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("views/bai2.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            User user = new User();
            BeanUtils.populate(user, request.getParameterMap());

            String[] hobbies = request.getParameterValues("hobbies");
            StringBuilder sb = new StringBuilder();
            for (String hobby : hobbies) {
                sb.append(hobby).append(", ");
            }
            user.setHobbies(sb.length() > 0 ? sb.substring(0, sb.length() - 2) : "");
            request.setAttribute("user", user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("views/bai2.jsp").forward(request, response);
    }
}
