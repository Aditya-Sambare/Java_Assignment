package day6_CoreJava_Arrays;
class Bank{
    private String username;
    private double balance;
    private long accountnumber;
    private String address;
    static double rate_of_intrest = 12;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(long accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
public class Que7 {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.setAccountnumber(601181927);
        b.setAddress("yashwant nagar kharadi");
        b.setBalance(100000.60);
        b.setUsername("Aditya");
        System.out.println("accountnumber is : "+b.getAccountnumber());
        System.out.println("address is : "+b.getAddress());
        System.out.println("balance is : "+b.getBalance());
        System.out.println("username is : "+b.getUsername());
        System.out.println("rate of intrest is : "+Bank.rate_of_intrest);
    }
}
//======================================
//output is
//        accountnumber is : 601181927
//        address is : yashwant nagar kharadi
//        balance is : 100000.6
//        username is : Aditya
//        rate of intrest is : 12.0
//
//        Process finished with exit code 0