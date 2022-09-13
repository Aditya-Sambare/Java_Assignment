import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/bye")

public class ByeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        String name = (String) servletContext.getAttribute("name");
        String pass = (String) servletContext.getAttribute("pass");
        String name1 = (String) servletContext.getAttribute("name1");
        String pass1 = (String) servletContext.getAttribute("pass1");
        PrintWriter out = resp.getWriter();
        out.println("username is "+name1+" password is "+pass1+" static name is "+name+" static pass is "+pass);
    }
}
