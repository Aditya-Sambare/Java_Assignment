package bankPojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class CurrentAccount implements BankAccount{
    @Id
    int accountNumber;
    String userName;
    String companyName;
    int balance;
    int phone;
    @OneToMany
    List<Address> address;

    public CurrentAccount() {
    }

    public CurrentAccount(int accountNumber, String userName, String companyName, int balance, int phone, List<Address> address) {
        this.accountNumber = accountNumber;
        this.userName = userName;
        this.companyName = companyName;
        this.balance = balance;
        this.phone = phone;
        this.address = address;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public List getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "accountNumber=" + accountNumber +
                ", userName='" + userName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", balance=" + balance +
                ", phone=" + phone +
                ", address=" + address +
                '}';
    }
}
