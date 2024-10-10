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
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String params = req.getParameter("param");
        ServletContext servletContext = getServletContext();
        //TODO придумать логику по фабричному методу, сейчас doGet жестко завязан на SpaceCraftService
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(new SpaceCraftService(params).launch());
        requestDispatcher.forward(req, resp);
    }
}
