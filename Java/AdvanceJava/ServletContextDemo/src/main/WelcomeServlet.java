import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/Welcome")
public class WelcomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String name = req.getParameter("username");
        String password = req.getParameter("password");
        PrintWriter out = resp.getWriter();
        out.println("Welcome "+name);
        out.println("<a href='bye'>bye</a>");
        ServletContext servletContext = getServletContext();
        servletContext.setAttribute("name1",name);
        servletContext.setAttribute("pass1",password);
    }
}
