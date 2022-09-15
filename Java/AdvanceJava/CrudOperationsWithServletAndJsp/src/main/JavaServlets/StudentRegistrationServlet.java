package JavaServlets;

import JavaClasses.StudentRecordInsertion;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/RegisterServlet")
public class StudentRegistrationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        int id = Integer.parseInt(req.getParameter("studentID"));
        String name = req.getParameter("studentName");
        int age = Integer.parseInt(req.getParameter("studentAge"));
        int sucess = StudentRecordInsertion.insertStudentsRecord(id,name,age);
        if(sucess>0){
            out.println("Student registered successfully");
        }else{
            out.println("Something went wrong");
        }
        out.println("<a href='Login.html'>click here to login</a>");
    }
}
