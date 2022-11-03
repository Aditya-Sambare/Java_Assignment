package controllers;

import entity.User;
import services.DatabaseServices;
import services.DatabaseServicesImplementation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/AddUserServlet")
public class AddUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        String userName = req.getParameter("userName");
        User user = new User();
        user.setUserName(userName);
        DatabaseServices databaseServices = new DatabaseServicesImplementation();
        databaseServices.addUser(user);
        printWriter.println("user added");
        printWriter.println("<a href='WelcomePage.html'>click here to go back to welcome page</a>");
    }
}
