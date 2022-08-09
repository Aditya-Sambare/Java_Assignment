package day16_CoreJava_ExceptionHandling;
import java.util.Scanner;
public class Transaction {
    static Scanner sc = new Scanner(System.in);
    static int balance = 45000;
    void whatTransaction(){
        System.out.println("Enter 1 for Deposit and 2 for Withdraw");
        System.out.println("Balance is : "+balance);
        int number1 = sc.nextInt();
        switch (number1){
            case 1 :
                Transaction.deposit();
                break;
            case 2 :
                Transaction.withdraw();
                break;
        }
    }
    static void withdraw(){
        System.out.println("enter the amount you want to withdraw");
        int amount = sc.nextInt();
        if (amount > balance){
            try {
                throw new InsufficientBalanceException();
            } catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            }
        }
        else {
            balance = balance - amount;
            System.out.println("Remaining Balance is : " + balance);
        }
        if (amount <= 0){
            try {
                throw new InvalidAmountException();
            } catch (InvalidAmountException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    static void deposit(){
        System.out.println("Enter the Amount you want to Deposit");
        int amount = sc.nextInt();
        if(amount <= 0){
            try {
                throw  new InvalidAmountException();
            } catch (InvalidAmountException e) {
                System.out.println(e.getMessage());
            }
        }
        else {
            balance = balance + amount;
            System.out.println("Balance is : "+ balance);
        }
    }
}
