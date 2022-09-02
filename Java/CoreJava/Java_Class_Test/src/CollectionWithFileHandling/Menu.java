package CollectionWithFileHandling;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws IOException {
        boolean exit = true;
        Scanner sc = new Scanner(System.in);
        Operations operations = new Operations();
        while(exit){
            System.out.println("enter 1 to add record\nenter 2 to display records\nenter 3 to add details in file\nenter 4 to exit");
            int op = Integer.parseInt(sc.nextLine());
            switch (op){
                case 1:
                    operations.addRecords();
                    break;
                case 2:
                    operations.displayRecords();
                    break;
                case 3:
                    operations.addListToFile();
                    break;
                case 4:
                    exit = false;
                    break;

            }
        }
    }
}
