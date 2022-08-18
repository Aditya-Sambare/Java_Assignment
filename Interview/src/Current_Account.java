import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Current_Account extends Bank_Account {
    String companyName;
    Current_Account(String name, String address, long mobile_Number, String email_Id, String companyName,long account_Number,int balance){
        super(name, address, mobile_Number, email_Id,account_Number,balance);
        this.companyName = companyName;
    }
    static Current_Account [] current_accounts_list = new Current_Account[10];
    static int i = 0;
    static void create_Current_Account() throws IOException {
        InputStreamReader sr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(sr);
        System.out.println(" enter your name \n enter your address \n enter your mobile number \n enter your email id \n enter your company name");
        String name = bf.readLine();
        String address = bf.readLine();
        long mobile_Number = Long.parseLong(bf.readLine());
        String email_Id = bf.readLine();
        String company_Name = bf.readLine();
        long account_Number = (long)(Math.random()*(999999999-100000000+1)+100000000);
        int balance = 0;
        current_accounts_list[i++] = new Current_Account(name,address,mobile_Number,email_Id,company_Name,account_Number,balance);
    }
    static void show()
    {
        for(Current_Account current_account : current_accounts_list)
        {
            if(current_account!=null)
            System.out.println(current_account.account_Number+" "+ current_account.name+" "+current_account.mobile_Number+" "+current_account.address+" "+current_account.email_Id+" "+current_account.companyName);
        }
    }
}

