package controllersServlets;

import bankPojo.CurrentAccount;
import bankPojo.SavingAccount;
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

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        int accountNumber = Integer.parseInt(req.getParameter("acountNumber"));
        int phone = Integer.parseInt(req.getParameter("phone"));
        String accounttype = BankServices.validateuser(accountNumber,phone);
        printWriter.println(accounttype);
        HttpSession httpSession= req.getSession();
        httpSession.setAttribute("accountNumber",accountNumber);
        if (accounttype.equals("savingAccount")){
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("SavingAccountServlet");
            requestDispatcher.forward(req,resp);
        }
        if (accounttype.equals("currentAccount")){
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("CurrentAccountServlet");
            requestDispatcher.forward(req,resp);
        }

    }
}
