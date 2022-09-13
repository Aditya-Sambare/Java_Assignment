import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/bye")
public class ByeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        //session tracking cookie example
//        Cookie cookie[] = req.getCookies();
//        out.println("name is "+ cookie[0].getValue()+" password is "+cookie[1].getValue());
//        //session tracking url re writing example
//        String name = req.getParameter("name");
//        String pass = req.getParameter("pass");
//        out.println("name is "+name+" password is "+pass);
//        //session tracking hidden form example
//        String name = req.getParameter("name");
//        String pass = req.getParameter("pass");
//        out.println("name is "+name+" password is "+pass);
        //        session tracking httpsession example
        HttpSession httpSession = req.getSession();
        String name = (String)httpSession.getAttribute("name");
        String pass = (String)httpSession.getAttribute("pass");
        out.println("name is "+name+" password is "+pass);
        httpSession.invalidate();
    }
}
