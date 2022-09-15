package JavaServlets;

import JavaClasses.StudentPojo;
import JavaClasses.StudentRecordFetching;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/StudentInformationServlet")
public class StudentInformationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        int id = Integer.parseInt(req.getParameter("id"));
        int age = Integer.parseInt(req.getParameter("age"));
        StudentPojo studentPojo = StudentRecordFetching.fetchRecord(id,age);
        if(studentPojo == null){
            out.println("Something went wrong");
        }else{
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("StudentPageServlet");
            requestDispatcher.forward(req,resp);
        }


    }
}
