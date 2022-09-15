package ControllersServlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.print("<h2>Welcome Admin</h2>");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("FetchRecords");
        requestDispatcher.include(req,resp);
        out.print("<br>");
        out.print("<a href='Register.html'>click here to insert record</a>");
        out.print("<br>");
        out.print("<a href='DeleteRecord.html'>click here to delete record</a>");
        out.print("<br>");
        out.print("<a href='Update.html'>click here to update</a>");
        out.print("<br>");
        out.print("<a href='logout'>log out</a>");
    }
}
