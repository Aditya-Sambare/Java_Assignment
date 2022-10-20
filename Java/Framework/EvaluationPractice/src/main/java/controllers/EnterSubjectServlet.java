package controllers;

import Services.DatabaseServices;
import Services.DatabaseServicesImplementation;
import entity.Subject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/EnterSubjectServlet")
public class EnterSubjectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        int studentId = Integer.parseInt(req.getParameter("studentId"));
        int subjectId = Integer.parseInt(req.getParameter("subjectId"));
        String subjectName = req.getParameter("subjectName");
        Subject subject = new Subject();
        subject.setSubjectId(subjectId);
        subject.setSubjectName(subjectName);
        DatabaseServices databaseServices = new DatabaseServicesImplementation();
        databaseServices.insertSubject(studentId,subject);
        printWriter.println("subject inserted");
        printWriter.println("<a href='Welcome.html'>click here to go back to menu</a>");
    }
}
