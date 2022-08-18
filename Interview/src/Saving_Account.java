import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Saving_Account extends  Add_Bank_Account{

    public Saving_Account(String name, String address, long mobile_Number, String email_Id) {
        super(name, address, mobile_Number, email_Id);

    }
    static void create_Saving_Account() throws IOException {
        InputStreamReader sr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(sr);
        System.out.println(" enter your name \n enter your address \n enter your mobile numbaer \n enter your email id ");
        String name = bf.readLine();
        String address = bf.readLine();
        int mobile_Number = bf.read();
        String email_Id = bf.readLine();
        Saving_Account [] saving_accounts_list = null;
        int i = 0;
        Saving_Account saving_account1 ;
        saving_account1 = new Saving_Account(name,address,mobile_Number,email_Id);
        saving_accounts_list[i] = saving_account1;
        i++;
    }
}
