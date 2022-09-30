package controllersServlets;

import bankPojo.CurrentAccount;
import bankService.BankServices;
import org.hibernate.type.PrimitiveCharacterArrayNClobType;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import static bankService.BankServices.fetchalluserCurrent;

@WebServlet("/FetchAllServlet")
public class FetchAllServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        List<CurrentAccount> currentAccountList = BankServices.fetchalluserCurrent();
        for (CurrentAccount c : currentAccountList){
            printWriter.println(c.getUserName());
        }

    }
}
