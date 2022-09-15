package ControllersServlets;

import DatabaseOperations.FetchingRecords;
import EmployeeDao.EmployeePojo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
// int id;
//         String password;
//         String name;
//         String address;
//         int age;
@WebServlet("/FetchRecords")
public class FetchRecordsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        ResultSet resultSet = FetchingRecords.fetchRecords();
        try{
            out.println("<table border=2><tr><th>Employee id</th><th>Employee password</th><th>Employee name</th><th>Employee address</th><th>Employee age</th> <tr>");
            while (resultSet.next())
            {
                int id = resultSet.getInt("id");
                String password = resultSet.getString("password");
                String name = resultSet.getString("name");
                String address = resultSet.getString("address");
                int age = resultSet.getInt("age");
                out.println("<tr><td>" + id + "</td><td>" + password + "</td><td>" + name + "</td><td>" + address + "</td><td>" + age + "</td></tr>");
            }
            out.println("</table>");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
