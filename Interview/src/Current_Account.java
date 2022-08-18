import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Current_Account extends Add_Bank_Account {
    String companyName;
    Current_Account(String name, String address, long mobile_Number, String email_Id, String companyName){
        super(name, address, mobile_Number, email_Id);
        this.companyName = companyName;
    }
    static void create_Current_Account() throws IOException {
        InputStreamReader sr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(sr);
        System.out.println(" enter your name \n enter your address \n enter your mobile numbaer \n enter your email id \n enter your company name");
        String name = bf.readLine();
        String address = bf.readLine();
        int mobile_Number = bf.read();
        String email_Id = bf.readLine();
        String company_Name = bf.readLine();
        bf.close();
        Current_Account [] current_accounts_list = null;
        int i = 0;
        Current_Account current_account1 ;
        current_account1 = new Current_Account(name,address,mobile_Number,email_Id,company_Name);
        current_accounts_list[i] = current_account1;
        i++;
    }
}

