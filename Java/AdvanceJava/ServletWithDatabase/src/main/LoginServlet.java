import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/loginservlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
    int id = Integer.parseInt(req.getParameter("id"));
    String name = req.getParameter("name");
        Connection connection = ConnectionProvider.getConnection();
        int id1 = 0;
        String name1 = null;
        String address1 = null;
        int mobilenumber1 = 0;
        int age1 = 0;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from employee where id=?");
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                 id1 = resultSet.getInt(1);
                 name1 = resultSet.getString(2);
                 address1 = resultSet.getString(3);
                 mobilenumber1 = resultSet.getInt(4);
                 age1 = resultSet.getInt(5);
            }
            if(id==id1){
                out.println("login sucessfull");
                out.println("<br>");
                out.println("user information is::::::::::");
                out.println("<br>");
                out.println("id is "+id1);
                out.println("<br>");
                out.println("name is "+name1);
                out.println("<br>");
                out.println("address is "+address1);
                out.println("<br>");
                out.println("mobile number is "+mobilenumber1);
                out.println("<br>");
                out.println("age is "+age1);
            }else{
                out.println("invalid information");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
