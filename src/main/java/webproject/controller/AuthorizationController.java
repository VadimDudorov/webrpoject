package webproject.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import webproject.service.AuthorizationService;
import webproject.service.SpaceCraftService;

import java.io.IOException;

@WebServlet(name = "AuthorizationController", value = "/authorization")
public class AuthorizationController extends HttpServlet {
    private final String paramLogin = "login";
    private final String paramPassword = "password";
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter(paramLogin);
        String password = req.getParameter(paramPassword);

        HttpSession httpSession = req.getSession();
        httpSession.setAttribute("login", login);

        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = servletContext.
                getRequestDispatcher(AuthorizationService.getAuthorizationService().launch(login, password));
        requestDispatcher.forward(req, resp);
    }
}
