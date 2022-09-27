package ServletsControllers;

import com.bean.Book;
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
import java.util.ArrayList;
import java.util.List;

@WebServlet("/FetchServlet")
public class FetchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        HttpSession httpSession = req.getSession();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringJT.xml");
        BookDao bookDao = (BookDao) applicationContext.getBean("bdao");
        List<Book> list = new ArrayList<>();
               list =  bookDao.fetchAllBooks();
        for(Book b: list) {
            printWriter.println(b);
        }

    }
}
