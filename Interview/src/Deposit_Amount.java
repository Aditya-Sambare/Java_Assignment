import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Deposit_Amount {
    static void deposit() throws IOException {
        InputStreamReader sr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(sr);
        System.out.println("Enter the account number");
        long account_no = Long.parseLong(bf.readLine());
        if(Arrays.asList(Saving_Account.saving_accounts_list).contains(account_no) || Arrays.asList(Current_Account.current_accounts_list).contains(account_no)){
            System.out.println("enter the amount you want to deposit");
            int deposit_Amount=Integer.parseInt(bf.readLine());
            for(int i=0;i<10;i++)
            {
                if(Saving_Account.saving_accounts_list!=null)
                {
                   if(Saving_Account.saving_accounts_list[i].account_Number==account_no)
                   {
                       Saving_Account.saving_accounts_list[i].balance =+ deposit_Amount;
                       System.out.println("your current balance is : "+Saving_Account.saving_accounts_list[i].balance);
                       break;
                   }
                }
            }
            for(int i=0;i<10;i++)
            {
                if(Current_Account.current_accounts_list!=null)
                {
                    if(Current_Account.current_accounts_list[i].account_Number==account_no)
                    {
                        Current_Account.current_accounts_list[i].balance =+ deposit_Amount;
                        System.out.println("your current balance is : "+Current_Account.current_accounts_list[i].balance);
                        break;
                    }
                }
            }
        }else {
            try {
                throw new AccountNotPresentException("account not avilabe");
            } catch (AccountNotPresentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
