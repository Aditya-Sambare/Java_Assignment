package ServletsControllers;

import com.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringJT.xml");
        BookDao bookDao = (BookDao) applicationContext.getBean("bdao");
        String bookname = req.getParameter("bookname");
        float price = Float.parseFloat(req.getParameter("price"));
        int execution = bookDao.updateBook(price,bookname);
        printWriter.println(execution+" record updated");
    }
}
