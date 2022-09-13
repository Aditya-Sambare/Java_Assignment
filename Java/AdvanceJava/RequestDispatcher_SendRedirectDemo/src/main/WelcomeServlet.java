import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        String name = req.getParameter("username");
        String pass = req.getParameter("password");
        req.setAttribute("name",name);
        req.setAttribute("pass",pass);
        out.println("name is "+name+" and pass is "+pass);
        out.println("this is welcome page");
//        //request dispatcher demo
//        RequestDispatcher rd = req.getRequestDispatcher("bye");
//        rd.forward(req,resp);
        //sendRedirect demo
        resp.sendRedirect("https://www.youtube.com/");
    }
}
