package controller.admin;

import dao.UserDAO;
import entities.Users;
import org.apache.commons.beanutils.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet({
        "/users/index",
        "/users/create",
        "/users/store",
        "/users/edit",
        "/users/update",
        "/users/delete",
        "/users/show",
})
public class UserServlet extends HttpServlet {

    private UserDAO userDAO;

    public UserServlet() {
        this.userDAO = new UserDAO();
    }

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        String uri = request.getRequestURI();

        if (uri.contains("index")) {
            this.index(request, response);
        } else if (uri.contains("create")) {
            this.create(request, response);
        } else if (uri.contains("edit")) {
            this.edit(request, response);
        } else if (uri.contains("delete")) {
            this.delete(request, response);
        } else if (uri.contains("store")) {
            this.store(request, response);
        }
    }

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("store")) {
            this.store(request, response);
        } else if (uri.contains("update")) {
            this.update(request, response);
        }
    }

    private void index(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        List<Users> list = userDAO.selectAll();
        request.setAttribute("list", list);
        request.setAttribute("views", "/views/admin/user/index.jsp");
        request.getRequestDispatcher("/views/layout.jsp").forward(request, response);
    }

    private void create(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        request.setAttribute("views", "/views/admin/user/create.jsp");
        request.getRequestDispatcher("/views/layout.jsp").forward(request, response);
    }

    private void store(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        try {
            Users user = new Users();
            BeanUtils.populate(user, request.getParameterMap());
            userDAO.create(user);
            System.out.println("Success");
            response.sendRedirect("/TestConnect/users/index");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error");
            response.sendRedirect("/TestConnect/users/create");
        }
    }

    private void edit(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Users user = userDAO.findById(id);
        request.setAttribute("user", user);
        request.setAttribute("views", "/views/admin/user/edit.jsp");
        request.getRequestDispatcher("/views/layout.jsp").forward(request, response);
    }

    private void delete(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            userDAO.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("fail");
        }
        response.sendRedirect("/TestConnect/users/index");
    }

    private void update(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Users oldUser = userDAO.findById(id);
        Users newUser = new Users();
        try {
            BeanUtils.populate(newUser, request.getParameterMap());
            newUser.setPassword(oldUser.getPassword());

            userDAO.update(newUser);
            System.out.println("user = " + newUser.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        response.sendRedirect("/TestConnect/users/index");
    }
}
