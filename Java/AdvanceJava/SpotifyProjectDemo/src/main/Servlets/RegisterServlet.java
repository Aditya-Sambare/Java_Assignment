package Servlets;

import DataBaseConnectionDAO.ConnectionProvider;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        int mobile = Integer.parseInt(req.getParameter("mobile"));

        Connection connection = ConnectionProvider.getConnection();
        printWriter.println("<!DOCTYPE html>");
        printWriter.println("<html>");
        printWriter.println("<head>");
        printWriter.println("<meta charset=\"utf-8\">");  // escape the quote marks
        printWriter.println("<title>Glassfish HTML Testing</title>");
        printWriter.println("<style>");     // start style
        // enclose style attributes withing the <style> </style> elements
        printWriter.println("h2 {");        // note leading brace
        printWriter.println("color:red;");
        printWriter.println("background-color:white;");
        printWriter.println("border: 1px solid black;");
        printWriter.println("}");          // note trailing brace for h1 style
        // add styles for other elements here using similar structure
        // note that separate lines are used for clarity -
        // all of the above could be one println
        printWriter.println("</style>");
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into user values(?,?,?)");
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,password);
            preparedStatement.setInt(3,mobile);
            int resultSet = preparedStatement.executeUpdate();
            if (resultSet > 0){
                printWriter.println("<h2>Registration Successful</h2>");
                printWriter.println("<br>");
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("Login.html");
                requestDispatcher.include(req,resp);

            }else{
                printWriter.println("Something went wrong");
                printWriter.println("<br>");
                printWriter.println("<a href='Register.html'>click here to Register</a>");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
