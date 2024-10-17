package webproject.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import webproject.service.SpaceCraftService;

import java.io.IOException;

@WebServlet(name = "SpaceCraftController", value = "/spaceCraft")
public class SpaceCraftController extends HttpServlet {
    private SpaceCraftService craftService;
    private final String paramHtml = "params";
    private final String paramName = "name";
    @Override
    public void init() throws ServletException {
        this.craftService = new SpaceCraftService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String params = req.getParameter(paramHtml);
        String name = req.getParameter(paramName);
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(craftService.launch(params, name));
        requestDispatcher.forward(req, resp);
    }
}
