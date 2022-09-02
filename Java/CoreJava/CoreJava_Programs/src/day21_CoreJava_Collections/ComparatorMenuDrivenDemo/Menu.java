package day21_CoreJava_Collections.ComparatorMenuDrivenDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;

public class Menu {
    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    BufferedReader bf = new BufferedReader(inputStreamReader);
    boolean exit = true;
    Operation operation = new Operation();
    void showMenu() throws IOException {
        while(exit){
            System.out.println("------------------------------------------------------------------");
        System.out.println("ENTER 1 TO INSERT DATA \nENTER 2 TO DISPLAY DATA \n" +
                "ENTER 3 TO DISPLAY SORTED DATA BY EMPLOYEE NAME \nENTER 4 TO DISPLAY SORTED DATA BY EMPLOYEE ID " +
                "\nENTER 5 TO DISPLAY SORTED DATA BY EMPLOYEE SALARY \nENTER 6 TO EXIT" );
            System.out.println("------------------------------------------------------------------");
        int option = Integer.parseInt(bf.readLine());
        switch (option){
            case 1://INSERT DATA
                operation.insertData();
                break;
            case 2://TO DISPLAY DATA
                operation.displayData();
                break;
            case 3://DISPLAY SORTED DATA BY EMPLOYEE NAME
                operation.displaySortedDataByName();
                break;
            case 4://DISPLAY SORTED DATA BY EMPLOYEE ID
                operation.displaySortedDataById();
                break;
            case 5://DISPLAY SORTED DATA BY EMPLOYEE SALARY
                operation.displaySortedDataBySalary();
                break;
            case 6://EXIT
                System.err.println("Thanks for using my program");
                exit = false;
                break;
        }
        }
    }
}
