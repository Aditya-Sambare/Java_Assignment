package ServletsControllers;

import com.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        String bookname = req.getParameter("bookname");
        String authorname = req.getParameter("authorname");
        float price = Float.parseFloat(req.getParameter("price"));
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringJT.xml");
        BookDao bookDao = (BookDao) applicationContext.getBean("bdao");
        HttpSession httpSession = req.getSession();
        httpSession.setAttribute("object",bookDao);
        bookDao.insertBook(bookname,authorname,price);

    }
}
