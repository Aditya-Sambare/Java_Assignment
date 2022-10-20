package controllers;

import Services.DatabaseServices;
import Services.DatabaseServicesImplementation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/DeleteStudentServlet")
public class DeleteStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        int studentId = Integer.parseInt(req.getParameter("studentId"));
        DatabaseServices databaseServices = new DatabaseServicesImplementation();
        databaseServices.deleteStudent(studentId);
        printWriter.println("student deleted");
        printWriter.println("<a href='Welcome.html'>click here to go back to menu</a>");
    }
}
