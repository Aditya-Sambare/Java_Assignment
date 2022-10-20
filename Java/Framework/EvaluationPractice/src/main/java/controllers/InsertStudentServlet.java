package controllers;

import Services.DatabaseServices;
import Services.DatabaseServicesImplementation;
import entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/InsertStudentServlet")
public class InsertStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        Student student = new Student();
        int studentId = Integer.parseInt(req.getParameter("studentId"));
        String studentName = req.getParameter("studentName");
        student.setStudentId(studentId);
        student.setStudentName(studentName);
        DatabaseServices databaseServices = new DatabaseServicesImplementation();
        databaseServices.insertStudent(student);
        printWriter.println("student inserted");
        printWriter.println("<a href='Welcome.html'>click here to go back to menu</a>");
    }
}
