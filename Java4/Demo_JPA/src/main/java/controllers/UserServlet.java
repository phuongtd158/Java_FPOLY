package controllers;

import dao.UserDAO;
import entity.User;

import org.apache.commons.beanutils.*;

import java.io.*;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(urlPatterns = { "/user/index", "/user/create", "/user/update", "/user/delete", "/user/edit", "/user/reset",
		"/user/search" })
public class UserServlet extends HttpServlet {

	UserDAO dao = new UserDAO();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uri = request.getRequestURI();
		selectAll(request, response);

		if (uri.contains("edit")) {
			edit(request, response);
		} else if (uri.contains("delete")) {
			delete(request, response);
			request.setAttribute("user", new User());
		} else if (uri.contains("reset")) {
			request.setAttribute("user", new User());
		} else if (uri.contains("search")) {
			String keyword = request.getParameter("keyword");
			List<User> list = dao.selectByFullName(keyword);
			request.setAttribute("users", list);
			for (User x : list) {
				System.out.println(x.toString());
			}
		}
		request.getRequestDispatcher("/views/admin/index.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uri = request.getRequestURI();
		selectAll(request, response);
		if (uri.contains("create")) {
			insert(request, response);
		} else if (uri.contains("edit")) {
			edit(request, response);
		} else if (uri.contains("update")) {
			update(request, response);
		} else if (uri.contains("delete")) {
			delete(request, response);
			request.setAttribute("user", new User());
		} else if (uri.contains("reset")) {
			request.setAttribute("user", new User());
		}
		request.getRequestDispatcher("/views/admin/index.jsp").forward(request, response);
	}

	private void insert(HttpServletRequest request, HttpServletResponse response) {
		try {
			String id = request.getParameter("userId");
			if (check(id)) {
				request.setAttribute("error", "User already exists");
			} else {
				User user = new User();
				BeanUtils.populate(user, request.getParameterMap());
				dao.insert(user);

				selectAll(request, response);
				request.setAttribute("mess", "Inserted");
			}
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("error", "Error: " + e.getMessage());
		}
	}

	private void edit(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("userId");
		User user = dao.selectById(id);

		request.setAttribute("user", user);
	}

	private void update(HttpServletRequest request, HttpServletResponse response) {

		try {
			User user = new User();
			BeanUtils.populate(user, request.getParameterMap());
			dao.update(user);

			selectAll(request, response);
			request.setAttribute("user", user);
			request.setAttribute("mess", "Updated");
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("error", "Error: " + e.getMessage());
		}

	}

	private void delete(HttpServletRequest request, HttpServletResponse response) {
		try {
			String id = request.getParameter("userId");
			dao.delete(id);

			selectAll(request, response);
			request.setAttribute("mess", "Deleted !");
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("error", "Error: " + e.getMessage());
		}
	}

	private void clear(HttpServletRequest request, HttpServletResponse response) {

	}

	private void selectAll(HttpServletRequest request, HttpServletResponse response) {
		try {
			UserDAO dao = new UserDAO();
			List<User> list = dao.selectAll();
			request.setAttribute("users", list);
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("error", "Error: " + e.getMessage());
		}
	}

	private boolean check(String userId) {
		List<User> list = dao.selectAll();
		for (User x : list) {
			if (x.getUserId().equals(userId)) {
				return true;
			}
		}
		return false;
	}

}