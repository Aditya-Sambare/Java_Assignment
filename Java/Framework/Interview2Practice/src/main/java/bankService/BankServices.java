package bankService;

import bankPojo.BankAccount;
import bankPojo.CurrentAccount;
import bankPojo.SavingAccount;
import databaseConnection.Connections;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class BankServices {
    static SessionFactory sessionFactory = Connections.getSessionFactory();
    public static int registerUser(CurrentAccount currentAccount){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        int status = (int) session.save(currentAccount);
        transaction.commit();
        session.close();
        return status;
    }
    public static int registerUser(SavingAccount savingAccount){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        int status = (int) session.save(savingAccount);
        transaction.commit();
        session.close();
        return status;
    }
    public static void deleteCurrentUser(CurrentAccount currentAccount){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(currentAccount);
        transaction.commit();
        session.close();
    }
    public static void updateCurrentUser(CurrentAccount currentAccount){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(currentAccount);
        transaction.commit();
        session.close();
    }
    public static CurrentAccount fetchuserCurrent(int currentAccountNumber){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        CurrentAccount currentAccount = session.get(CurrentAccount.class,currentAccountNumber);
        session.close();
        return currentAccount;

    }
    public static SavingAccount fetchuserSaving(int savingAccountNumber){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        SavingAccount savingAccount = session.get(SavingAccount.class,savingAccountNumber);
        session.close();
        return savingAccount;
    }
    public static List<CurrentAccount> fetchalluserCurrent(){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<CurrentAccount> currentAccountList = session.createQuery("from CurrentAccount").list();
return currentAccountList;
    }
    public static String validateuser(int accountNumber, int phone){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String accounttype = null;
        CurrentAccount currentAccount = session.get(CurrentAccount.class,accountNumber);
        if(!(currentAccount ==null)){
            if (currentAccount.getAccountNumber() == accountNumber && currentAccount.getPhone()==phone){
                accounttype =  "currentAccount";
            }

        }else{
        SavingAccount savingAccount = session.get(SavingAccount.class,accountNumber);
        if (!(savingAccount == null)){
            if(savingAccount.getAccountNumber()==accountNumber && savingAccount.getPhone()==phone){
                accounttype = "savingAccount";
            }
        }
    }
        session.close();
        return accounttype;
    }

}

