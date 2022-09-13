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
        String name =(String) req.getAttribute("name");
        String pass =(String) req.getAttribute("pass");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("name is "+name+" and pass is "+pass);
        out.println("this is bye page");
    }
}
