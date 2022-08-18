import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Saving_Account extends Bank_Account {
    public Saving_Account(String name, String address, long mobile_Number, String email_Id,long account_Number,int balance) {
        super(name, address, mobile_Number, email_Id,account_Number,balance);
    }
    static Saving_Account[] saving_accounts_list = new Saving_Account[10];
    static  int i = 0;
    static void create_Saving_Account() throws IOException {
        InputStreamReader sr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(sr);
        System.out.println(" enter your name \n enter your address \n enter your mobile numbaer \n enter your email id ");
        String name = bf.readLine();
        String address = bf.readLine();
        long mobile_Number = Long.parseLong(bf.readLine());
        String email_Id = bf.readLine();
        long account_Number = (long)(Math.random()*(999999999-100000000+1)+100000000);
        int balance = 0;
        saving_accounts_list[i++] = new Saving_Account(name, address, mobile_Number, email_Id,account_Number,balance);
    }
    static void show()
    {
        for(Saving_Account saving_account : saving_accounts_list)
        {
            if(saving_account!=null)
                System.out.println(saving_account.account_Number+" "+saving_account.name+" "+saving_account.address+" "+saving_account.mobile_Number
                        +" "+saving_account.email_Id+" "+ saving_account.balance);
        }
    }
}

