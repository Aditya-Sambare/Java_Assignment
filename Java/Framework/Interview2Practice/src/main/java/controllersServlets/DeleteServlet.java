package controllersServlets;

import bankPojo.BankAccount;
import bankPojo.CurrentAccount;
import bankService.BankServices;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        HttpSession httpSession = req.getSession();
        int accountNumber = (int) httpSession.getAttribute("accountNumber");
        CurrentAccount currentAccount = BankServices.fetchuserCurrent(accountNumber);
        BankServices.deleteCurrentUser(currentAccount);
        printWriter.println("deleted");
    }
}
