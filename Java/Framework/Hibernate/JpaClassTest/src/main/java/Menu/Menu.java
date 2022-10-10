package Menu;

import crudOperations.CrudOperations;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class Menu {
    CrudOperations crudOperations = new CrudOperations();
    Scanner sc = new Scanner(System.in);
    public void showMenu(){
        boolean entry = true;
        while(entry){
            System.out.println("..........................................................................................");

            System.out.println("Enter 1 to exit\nEnter 2 to insert book into any library\nEnter 3 to update book from any library" +
                    "\nEnter 4 to delete book from any library\nEnter 5 to fetch a book details from any library" +
                    "\nEnter 6 to insert new library");
            System.out.println("..........................................................................................");

            int option = Integer.parseInt(sc.next());
        switch (option){
            case 1:
                entry = false;
                break;
            case 2:
                crudOperations.insertbook();
                    break;
            case 3:
                crudOperations.updatebook();
                break;
            case 4 :
                crudOperations.deletebook();
                break;
            case 5 :
                crudOperations.fetchbook();
                break;
            case 6:
                crudOperations.insertLibrary();
        }
    }
    }
}
