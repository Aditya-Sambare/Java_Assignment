package day25_CoreJava_JDBC.MenuDrivenCrudOperationsUsingJdbc.MenuClasses;
import day25_CoreJava_JDBC.MenuDrivenCrudOperationsUsingJdbc.CrudOperations.OperationsToPerform;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class OperationsMenu {
    public void showMenu() throws IOException {
        boolean exit = true;
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        while(exit){
            System.out.println("-----------------------------------------------------------------------------------------------------\nENTER 1 TO INSERT RECORD. \nENTER 2 TO DELETE RECORD. \n" +
                    "ENTER 3 TO FETCH A PARTICULAR RECORD. \nENTER 4 TO FETCH ALL RECORDS. \nENTER 5 TO UPDATE RECORD." +
                    "\nENTER 6 TO SORT. \nENTER 7 TO EXIT.\n-----------------------------------------------------------------------------------------------------");
            int operation = Integer.parseInt(bufferedReader.readLine());
            switch (operation){
                case 1://insert records.
                    new OperationsToPerform().insertRecord();
                    break;
                case 2://delete records.
                    new OperationsToPerform().deleteRecord();
                    break;
                case 3://fetch a particular records.
                    new OperationsToPerform().fetchParticularRecord();
                    break;
                case 4://fetch all records.
                    new OperationsToPerform().fetchAllRecords();
                    break;
                case 5://update record.
                    new OperationsToPerform().updateRecord();
                    break;
                case 6://sort
                    new OperationsToPerform().sortTheRecords();
                    break;
                case 7://exit
                    exit=false;
                    break;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        new OperationsMenu().showMenu();
    }
}
