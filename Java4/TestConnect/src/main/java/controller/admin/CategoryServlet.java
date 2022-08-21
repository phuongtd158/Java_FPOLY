package controller.admin;

import dao.CategoryDAO;
import dao.UserDAO;
import entities.Categories;
import entities.Users;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/categories")
public class CategoryServlet extends HttpServlet {

    private UserDAO userDAO;
    private CategoryDAO categoryDAO;

    public CategoryServlet() {
        this.userDAO = new UserDAO();
        this.categoryDAO = new CategoryDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Users> listUser = userDAO.selectAll();

        request.setAttribute("listUser", listUser);
        request.getRequestDispatcher("/views/admin/category/create.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int userId = Integer.parseInt(request.getParameter("user_id"));
            String name = request.getParameter("ten");
            Categories category = new Categories();
            Users user = userDAO.findById(userId);

            category.setTen(name);
            category.setUser(user);

            categoryDAO.create(category);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
