package controller;

import dao.UserDAO;
import entity.Users;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = {
        "/index",
        "/create",
        "/store",
        "/edit",
        "/update",
        "/delete"
})
public class UserServlet extends HttpServlet {

    private UserDAO userDAO;

    public UserServlet() {
        this.userDAO = new UserDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();

        if (uri.contains("index")) {
            this.index(request, response);
        } else if (uri.contains("create")) {
            this.create(request, response);
        } else if (uri.contains("edit")) {
            this.edit(request, response);
        } else if (uri.contains("delete")) {
            this.delete(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("store")) {
            this.store(request, response);
        } else if (uri.contains("update")) {
            this.update(request, response);
        }
    }

    protected void index(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Users> listUser = userDAO.findAll();

        request.setAttribute("list", listUser);
        request.setAttribute("views", "/views/index.jsp");
        request.getRequestDispatcher("/views/layout.jsp").forward(request, response);
    }

    protected void create(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("views", "/views/create.jsp");
        request.getRequestDispatcher("/views/layout.jsp").forward(request, response);
    }

    protected void store(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Users user = new Users();
        try {
            BeanUtils.populate(user, request.getParameterMap());
            userDAO.create(user);
            System.out.println("user.toString() = " + user.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        response.sendRedirect("/PH13747_TranDucPhuong_Lab5_300322/index");
    }

    protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            userDAO.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        response.sendRedirect("/PH13747_TranDucPhuong_Lab5_300322/index");
    }

    protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        Users user = userDAO.findById(id);

        request.setAttribute("user", user);
        request.setAttribute("views", "/views/edit.jsp");
        request.getRequestDispatcher("/views/layout.jsp").forward(request, response);
    }

    protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        Users newUser = new Users();
        Users oldUser = userDAO.findById(id);
        try {
            BeanUtils.populate(newUser, request.getParameterMap());
            newUser.setPassword(oldUser.getPassword());
            userDAO.update(newUser);
        } catch (Exception e) {
            e.printStackTrace();
        }
        response.sendRedirect("/PH13747_TranDucPhuong_Lab5_300322/index");
    }
}
