package controllersServlets;

import bankPojo.Address;
import bankPojo.CurrentAccount;
import bankPojo.SavingAccount;
import bankService.BankServices;
import databaseConnection.Connections;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        Random rand = new Random();
        PrintWriter printWriter = new PrintWriter(resp.getWriter());
String accountType = req.getParameter("accountType");
int accountNumber = ThreadLocalRandom.current().nextInt(10,100000000)*1000;
int balance = 10000;
String userName = req.getParameter("userName");
String companyName = req.getParameter("companyName");
int phone = Integer.parseInt(req.getParameter("phone"));
int houseNoPermanent = Integer.parseInt(req.getParameter("hnp"));
String areaPermanent = req.getParameter("areap");
String statePermanent = req.getParameter("statep");
String cityPermanent = req.getParameter("cityp");
        int   houseNotemporary = Integer.parseInt(req.getParameter("hnt"));
        String    areaTemporary = req.getParameter("areat");
        String    stateTemporary = req.getParameter("statet");
        String    cityTemporary = req.getParameter("cityt");
Address address1 = new Address(houseNoPermanent,areaPermanent,cityPermanent,statePermanent);
Address address2 = new Address(houseNotemporary,areaTemporary,cityTemporary,stateTemporary);
        SessionFactory sessionFactory = Connections.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(address1);
        session.save(address2);
        transaction.commit();
        session.close();
        List<Address> addressList = new ArrayList<>();
        addressList.add(address1);
        addressList.add(address2);
if(accountType.equals("savingAccount")){
    SavingAccount savingAccount = new SavingAccount(accountNumber,userName,balance,phone,addressList);
    int status = BankServices.registerUser(savingAccount);
    if(status>0){
        printWriter.println("registered");
    }else{
        printWriter.println("something went wrong");
    }
}
if(accountType.equals("currentAccount")){
    CurrentAccount currentAccount = new CurrentAccount(accountNumber,userName,companyName,balance,phone,addressList);
    int status = BankServices.registerUser(currentAccount);
    if(status>0){
        printWriter.println("registered");
    }else{
        printWriter.println("something went wrong");
    }
}
    }
}
