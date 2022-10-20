package controllers;

import Services.DatabaseServices;
import Services.DatabaseServicesImplementation;
import entity.Marks;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/EnterMarksServlet")
public class EnterMarksServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        int studentId = Integer.parseInt(req.getParameter("studentId"));
        int subjectId =  Integer.parseInt(req.getParameter("subjectId"));
        int marks =  Integer.parseInt(req.getParameter("marks"));
        String status = req.getParameter("status");
        Marks marks1 = new Marks();
        marks1.setMarks(marks);
        marks1.setStudentId(studentId);
        marks1.setSubjectId(subjectId);
        marks1.setStatus(status);
        DatabaseServices databaseServices = new DatabaseServicesImplementation();
        databaseServices.insertMarks(marks1);
        printWriter.println("marks inserted");
        printWriter.println("<a href='Welcome.html'>click here to go back to menu</a>");

    }
}
