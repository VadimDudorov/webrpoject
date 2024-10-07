package webproject.service.spacecraft;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "LogicService", value = "/logic")
public class LogicService extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String parameter = req.getParameter("params");
        resp.sendRedirect("/team.jsp");
        if(parameter.equals("team")){
            resp.sendRedirect("/team.jsp");
        }
    }
}
