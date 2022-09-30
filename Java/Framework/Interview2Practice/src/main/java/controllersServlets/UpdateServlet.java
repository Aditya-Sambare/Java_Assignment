package controllersServlets;

import bankPojo.CurrentAccount;
import bankService.BankServices;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        HttpSession httpSession = req.getSession();
        int accountNumber = (int) httpSession.getAttribute("accountNumber");
        CurrentAccount currentAccount = BankServices.fetchuserCurrent(accountNumber);
        currentAccount.setBalance(500000);
        BankServices.updateCurrentUser(currentAccount);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("CurrentAccountServlet");
        requestDispatcher.forward(req,resp);

    }
}
