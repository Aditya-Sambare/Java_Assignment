package September02Test;

import September02Test.ConnectionMaker.SortOperations;

import java.util.Scanner;

public class Menu {
    public void showMenu(){
        boolean exit = true;
        Scanner sc = new Scanner(System.in);
    while (exit){
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        System.out.println("ENTER 1 TO CREATE TABLE\nENTER 2 TO INSERT RECORD\nENTER 3 TO FETCH RECORDS\nENTER 4 TO UPDATE PRICE\nENTER 5 TO DELETE RECORD\nENTER 6 TO SORT BY ID\nENTER 7 TO SORT BY PUBLISHER\nENTER 8 TO PRINT PUBLISHER WISE AUTHOR\nENTER 9 TO EXIT");
        System.out.println("----------------------------------------------------------------------------------------------------------------------");

        int op = sc.nextInt();
        switch (op){
            case 1://create table
                new Crud().createTable();
                break;
            case 2://insert record
                new Crud().insertRecord();
                break;
            case 3://fetch records
                new Crud().fetchAllRecords();
                break;
            case 4://update price
                new Crud().updateRecord();
                break;
            case 5://delete record
                new Crud().deleteRecord();
                break;
            case 6://sort by id
                new SortOperations().SortById();
                break;
            case 7://sort by publisher
                new SortOperations().SortByPublisher();
                break;
            case 8://publisher wise author
                new Crud().publisherByAuthor();
                break;
            case 9://exit
                exit = false;
                break;
        }
    }
    }
}
