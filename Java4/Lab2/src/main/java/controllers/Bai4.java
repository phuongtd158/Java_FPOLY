package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

@WebServlet(name = "Bai4", value = "/Bai4")
public class Bai4 extends HttpServlet {

    int count = 0;
    Path path = Paths.get("C:/Users/ADMIN/Desktop/count.txt");

    @Override
    public void init() {
        try {
            count = Integer.parseInt(Files.readAllLines(path).get(0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        count++;
        req.setAttribute("count", count);
        req.getRequestDispatcher("views/bai4.jsp").forward(req, resp);
    }

    @Override
    public void destroy() {
        try {
            Files.write(path, String.valueOf(count).getBytes(),
                    StandardOpenOption.WRITE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
