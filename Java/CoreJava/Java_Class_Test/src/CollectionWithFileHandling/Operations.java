package CollectionWithFileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operations {
    List<Staff> staffList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    void addRecords(){
        boolean exit = true;
        while(exit) {
            System.out.println("To insert the doctor's record enter 1 \nTo insert nurse record enter 2 \nTo exit enter 3");
            int operationToPerform = Integer.parseInt(sc.nextLine());
            switch (operationToPerform){
                case 1:
                    System.out.println("enter doctors detail \nenter id\nenter name\nenter age\nenter salary\nenter experience\nenter designation");
                    int id = Integer.parseInt(sc.nextLine());
                    String name = sc.nextLine();
                    int age = Integer.parseInt(sc.nextLine());
                    int salary = Integer.parseInt(sc.nextLine());
                    int exp = Integer.parseInt(sc.nextLine());
                    String designation = sc.nextLine();
                    staffList.add(new Doctor(id,name,age,salary,exp,designation));
                    break;
                case 2:
                    System.out.println("enter nurse details\nenter id\nenter name\nenter age\nenter salary\nenter nurseType\nenter number of patient assigned");
                    int id1 = Integer.parseInt(sc.nextLine());
                    String name1 = sc.nextLine();
                    int age1 = Integer.parseInt(sc.nextLine());
                    int salary1 = Integer.parseInt(sc.nextLine());
                    String nurseType = sc.nextLine();
                    int patientAssigned = Integer.parseInt(sc.nextLine());
                    staffList.add(new Nurse(id1,name1,age1,salary1,nurseType,patientAssigned));
                    break;
                case 3 :
                    exit = false;
                    break;

            }
        }

    }
    void displayRecords(){
        for (Staff s : staffList){
            System.out.println(s);
        }
    }
    void addListToFile() throws IOException {
        FileWriter fileWriter = new FileWriter("StaffList.txt");
        for (Staff s : staffList) {
            fileWriter.write(String.valueOf(s));
        }
        fileWriter.flush();
        fileWriter.close();

    }
}
