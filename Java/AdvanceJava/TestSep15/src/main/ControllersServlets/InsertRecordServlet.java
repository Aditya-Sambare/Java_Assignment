package ControllersServlets;

import DatabaseOperations.RecordInsertion;
import EmployeeDao.EmployeePojo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/InsertRecordsServlet")
public class InsertRecordServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        int id = Integer.parseInt(req.getParameter("id"));
        String password = req.getParameter("password");
        String name = req.getParameter("name");
        String address = req.getParameter("address");
        int age = Integer.parseInt(req.getParameter("age"));
        EmployeePojo employeePojo = new EmployeePojo(id,password,name,address,age);
        int success = RecordInsertion.insertRecord(employeePojo);
        if(success > 0 ){
            out.print("Record Inserted Successfully");
        }else{
            out.println("Somethimng went wrong");
        }

    }
}
