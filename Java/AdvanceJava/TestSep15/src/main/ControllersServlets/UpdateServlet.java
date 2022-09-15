package ControllersServlets;

import DatabaseOperations.RecordUpdation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        int id = Integer.parseInt(req.getParameter("id"));
        String password = req.getParameter("password");
        String name = req.getParameter("name");
        String address = req.getParameter("address");
        int age = Integer.parseInt(req.getParameter("age"));
        int success = RecordUpdation.updateRecord(id,password,name,address,age);
        if(success>0){
            out.println("record updated");
        }else{
            out.println("something went wrong");
        }
    }
}
