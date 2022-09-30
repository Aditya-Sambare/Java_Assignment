package controllersServlets;

import bankPojo.Address;
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
import java.util.List;

@WebServlet("/CurrentAccountServlet")
public class CurrentAccountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        HttpSession httpSession = req.getSession();
        int accountNumber = (int) httpSession.getAttribute("accountNumber");
        printWriter.println("this is current account");
        CurrentAccount currentAccount = BankServices.fetchuserCurrent(accountNumber);
        printWriter.println("<br>");
        printWriter.println("Account number is :"+currentAccount.getAccountNumber());
        printWriter.println("<br>");
        printWriter.println("phone number is : "+currentAccount.getPhone());
        printWriter.println("<br>");
        printWriter.println("balance is  "+currentAccount.getBalance());
        printWriter.println("<br>");
        printWriter.println("address isss  : : : : "+currentAccount.getAddress());
        for(Object a : currentAccount.getAddress()){
            //printWriter.println(a.getAddressid()+"  house no is "+a.getHouseno());
            System.out.println("address "+a.toString());
        }

        printWriter.println("company name iss    "+currentAccount.getCompanyName());
        printWriter.println("<br>");
        printWriter.println("<a href='DeleteServlet'>delete</a><br>");
        printWriter.println("<a href='UpdateServlet'>update</a><br>");
        printWriter.println("<a href='FetchAllServlet'>fetch all</a><br>");
        printWriter.println("address is not getting ");
    }
}
