package controllersServlets;

import bankPojo.CurrentAccount;
import bankPojo.SavingAccount;
import bankService.BankServices;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SavingAccountServlet")
public class SavingAccountServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("this is saving acount");
        HttpSession httpSession = req.getSession();
        int accountNumber = (int) httpSession.getAttribute("accountNumber");
        SavingAccount savingAccount = BankServices.fetchuserSaving(accountNumber);
        printWriter.println(savingAccount.getUserName());
    }
}
