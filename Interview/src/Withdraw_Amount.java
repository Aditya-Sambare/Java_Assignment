import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Withdraw_Amount {
    static void withdraw() throws IOException {
        InputStreamReader sr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(sr);
        System.out.println("Enter the account number");
        long account_no = Long.parseLong(bf.readLine());
        if(Arrays.asList(Saving_Account.saving_accounts_list).contains(account_no) || Arrays.asList(Current_Account.current_accounts_list).contains(account_no)){
            System.out.println("enter the amount you want to withdraw");
            int withdraw_Amount=Integer.parseInt(bf.readLine());
            for(int i=0;i<10;i++)
            {
                if(Saving_Account.saving_accounts_list!=null)
                {
                    if(Saving_Account.saving_accounts_list[i].account_Number==account_no)
                    {
                        if(Saving_Account.saving_accounts_list[i].balance < withdraw_Amount){
                            try {
                                throw new InsuffcientBalanceException("insuffcient balance");
                            } catch (InsuffcientBalanceException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        Saving_Account.saving_accounts_list[i].balance = Saving_Account.saving_accounts_list[i].balance - withdraw_Amount;
                        System.out.println("current balance is : "+Saving_Account.saving_accounts_list[i].balance);
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
                        if(Current_Account.current_accounts_list[i].balance<withdraw_Amount){
                            try {
                                throw new InsuffcientBalanceException("insuffcient balance");
                            } catch (InsuffcientBalanceException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        Current_Account.current_accounts_list[i].balance = Current_Account.current_accounts_list[i].balance - withdraw_Amount;
                        System.out.println("current balance is : "+Current_Account.current_accounts_list[i].balance);
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
