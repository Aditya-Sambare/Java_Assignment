package Servlets;

import DataBaseConnectionDAO.ConnectionProvider;

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
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into user values(?,?,?)");
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,password);
            preparedStatement.setInt(3,mobile);
            int resultSet = preparedStatement.executeUpdate();
            if (resultSet > 0){
                printWriter.println("Registration Successful");
                printWriter.println("<br>");
                printWriter.println("<a href='Login.html'>click here to login</a>");
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
