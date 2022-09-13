import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Welcome")
public class WelcomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String name = req.getParameter("username");
        String pass =  req.getParameter("password");
        //session tracking cookie example
//        Cookie[] cookies = req.getCookies();
//        cookies[0].setValue(req.getParameter("username"));
//        cookies[1].setValue(req.getParameter("password"));
////        Cookie cookie = new Cookie("name",req.getParameter("username"));
////        Cookie cookie1 = new Cookie("pass",req.getParameter("password"));
//        resp.addCookie(cookies[0]);
//        resp.addCookie(cookies[1]);
//        out.println("name is "+cookies[0].getValue()+" password is "+cookies[1].getValue());
//        //session tracking url re writing example
//        out.println("name is "+name+" password is "+pass);
//        out.println("<a href='bye?name="+name+"&&pass="+pass+"'>bye</a>");
//        //session tracking hidden form example
//        out.println("name is "+name+" password is "+pass);
//        out.println("" +
//                "<form action='bye'>" +
//                "<input type='hidden' name='name' value="+name+">"+
//                "<input type='hidden' name='pass' value="+pass+">" +
//                "<input type='submit' value='bye'>"
//        );
//        session tracking httpsession example
        HttpSession httpSession = req.getSession();
        httpSession.setAttribute("name",name);
        httpSession.setAttribute("pass",pass);
        out.println("name is "+name+" password is "+pass);
        out.println("<a href='bye'>bye</a>");
    }
}
