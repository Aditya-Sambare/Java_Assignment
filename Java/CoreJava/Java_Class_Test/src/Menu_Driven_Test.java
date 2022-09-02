import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MenuDriven{
    InputStreamReader sr = new InputStreamReader(System.in);
    BufferedReader bf = new BufferedReader(sr);
    Operation1 operation1 = new Operation1();
    void menuDrivenDemo() throws IOException {
        boolean flag = true;
        while(flag){
            System.out.println("-------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Enter 1 to insert record \nEnter 2 to update record \nEnter 3 to remove record \nEnter 4 to fetch all record \nEnter 5 to exit");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------");
            int operation = Integer.parseInt(bf.readLine());
            switch (operation){
                case 1://insert
                    System.out.println("Enter id\nFirst name\nLast name\ncity\ntechstack\nmobile number");
                    int id = Integer.parseInt(bf.readLine());
                    String firstName = bf.readLine();
                    String lastName = bf.readLine();
                    String city = bf.readLine();
                    String techStack = bf.readLine();
                    String mobileNumber = bf.readLine();
                    operation1.insert(id,firstName,lastName,city,techStack,mobileNumber);
                    break;
                case 2://update
                    System.out.println("Enter id for which you want to update record and then enter updated \nFirst name\nLast name\ncity\ntechstack\nmobile number");
                    int id1 = Integer.parseInt(bf.readLine());
                    String firstName1 = bf.readLine();
                    String lastName1 = bf.readLine();
                    String city1 = bf.readLine();
                    String techStack1 = bf.readLine();
                    String mobileNumber1 = bf.readLine();
                    operation1.update(id1,firstName1,lastName1,city1,techStack1,mobileNumber1);
                    break;
                case 3://remove
                    System.out.println("enter the id to delete the record");
                    int idTORemove = Integer.parseInt(bf.readLine());
                    operation1.removeRecord(idTORemove);
                    break;
                case 4://fetch all
                        operation1.displayRecords();
                    break;
                case 5://exit
                    flag = false;
                    break;
            }
        }
    }
}
public class Menu_Driven_Test {
    public static void main(String[] args) throws IOException {
        MenuDriven menuDriven = new MenuDriven();
        menuDriven.menuDrivenDemo();

    }
}
