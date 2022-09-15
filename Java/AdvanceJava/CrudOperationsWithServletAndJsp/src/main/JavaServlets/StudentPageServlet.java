package JavaServlets;

import JavaClasses.StudentPojo;
import JavaClasses.StudentRecordFetching;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/StudentPageServlet")
public class StudentPageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        int id = Integer.parseInt(req.getParameter("id"));
        int age = Integer.parseInt(req.getParameter("age"));
        StudentPojo studentPojo = StudentRecordFetching.fetchRecord(id,age);
        out.println("student id is "+studentPojo.getStudentID());
        out.println("student name is "+studentPojo.getStudentName());
        out.println("student age is "+studentPojo.getStudentAge());

    }
}
