import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(" Enter 0 to Exit \n Enter 1 to add Bank account \n Enter 2 to deposit amount \n " +
                "Enter 3 to Withdraw amount \n Enter 4 to Display all account details");
        Scanner sc = new Scanner(System.in);

        int operation = sc.nextInt();
        boolean exit = true;
        while(exit){
        switch(operation){
            case 0 : exit = false;
            break;
            case 1 :
                String account_Type;
                System.out.println("Enter the account type");
                account_Type = sc.next();
                if (account_Type.equals("current")){
                    Current_Account.create_Current_Account();
                    break;
                } else if (account_Type.equals("saving")){
                    Saving_Account.create_Saving_Account();
                    break;
                }
                else {
                    System.out.println("Wrong account type");
                    break;
                }
            case 2:
                System.out.println("Deposit");
                break;
            case 3:
                System.out.println("withdraw");
                break;
            case 4:
                System.out.println("show account details");
                break;
        }
    }
}
}
