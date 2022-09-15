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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String address = req.getParameter("address");
        Integer mobileNumber = Integer.valueOf(req.getParameter("mobilenumber"));
        int age = Integer.parseInt(req.getParameter("age"));
        PrintWriter out = resp.getWriter();
        Pattern p = Pattern.compile("^[A-Za-z, ]++$");
        Matcher matcher= p.matcher(name);
        if(!matcher.matches()) {
            out.println("invalid name");
            out.println("<a href='index.html'>go back to registration page</a>");
            out.println("<br>");
        }
        else if (!(mobileNumber.toString().length() == 10)){
            out.println("invalid mobile number");
            out.println("<a href='index.html'>go back to registration page</a>");
        }else{
        Connection connection = ConnectionProvider.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into employee values(?,?,?,?,?)");
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,address);
            preparedStatement.setInt(4,mobileNumber);
            preparedStatement.setInt(5,age);
            int resultset = preparedStatement.executeUpdate();
            if(resultset>0){
                out.println("Registerd sucessfully");
            }
            out.println("<a href='Login.html'>login now</a>");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
}

