import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/registerservlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h2>welcome to register servlet</h2>");
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String gender = req.getParameter("gender");
        String course = req.getParameter("usercourse");
        String condition = req.getParameter("condition");
        if (condition.equals("checked")) {
            out.println("<h2>name is" + name + "</h2>");
            out.println("<h2>password is" + password + "</h2>");
            out.println("<h2>email is" + email + "</h2>");
            out.println("<h2>gender is" + gender + "</h2>");
            out.println("<h2>course is" + course + "</h2>");
        }else{
            out.println("<h2>you have not accept the terms</h2>");
    }
    }
}