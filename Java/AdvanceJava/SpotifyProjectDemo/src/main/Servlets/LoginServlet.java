package Servlets;
import DataBaseConnectionDAO.ConnectionProvider;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Connection connection = ConnectionProvider.getConnection();
        ResultSet resultSet = null;
        String name1 = null;
        String password1 = null;
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        HttpSession httpsession=req.getSession();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("select * from user where name = ? and password = ?");
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,password);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                name1 = resultSet.getString(1);
                password1 = resultSet.getString(2);
            }
            if(name.equals(name1) && password.equals(password1)){
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("WelcomePage.html");
                requestDispatcher.include(req,resp);
            }else{
                printWriter.println("Invalid Credintials");
                printWriter.println("<a href='Login.html'>Click here to login</a>");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
