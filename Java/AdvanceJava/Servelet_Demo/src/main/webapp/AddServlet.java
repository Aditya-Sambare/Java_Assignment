package webapp;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
public class AddServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        PrintWriter out = res.getWriter();

out.println("<form action='finalpage'>");
out.println("<label for='num1'>number1:</label><br>");
out.println(" <input type='text' id='num1' name='num1'><br>");
out.println(" <label for='num2'>number2:</label><br>");
out.println("  <input type='text' id='num2' name='num2'><br>");
out.println("  <input type='submit' value='Add'>");
    }
}
