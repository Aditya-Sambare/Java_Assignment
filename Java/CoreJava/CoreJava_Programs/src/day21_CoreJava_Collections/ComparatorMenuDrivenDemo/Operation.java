package day21_CoreJava_Collections.ComparatorMenuDrivenDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
public class Operation {
    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    BufferedReader bf = new BufferedReader(inputStreamReader);
    ArrayList<Employee> employeeList = new ArrayList<>();
    ArrayList<Employee> employeeListSortedByName = new ArrayList<>();
    ArrayList<Employee> employeeListSortedById = new ArrayList<>();
    ArrayList<Employee> employeeListSortedBySalary = new ArrayList<>();
    public void insertData() throws IOException {
        System.out.println("Enter how many records you want to enter");
        int noOfRecords = Integer.parseInt(bf.readLine());
        for (int i = 0; i < noOfRecords; i++) {
            System.out.println("ENTER EMPLOYEE ID, NAME, CITY, SALARY");
            int id = Integer.parseInt(bf.readLine());
            String name = bf.readLine();
            String city = bf.readLine();
            int salary = Integer.parseInt(bf.readLine());
            employeeList.add(new Employee(id,name,city,salary));
        }
    }
    public void displayData(){
        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i));
        }
    }
    public void displaySortedDataByName(){
        employeeListSortedByName.addAll(employeeList);
        Collections.sort(employeeListSortedByName, new SortByName());
        System.out.println("-------------------------------------------------------------------");
        for (int i = 0; i < employeeListSortedByName.size(); i++) {
            System.out.println(employeeListSortedByName.get(i));
        }
    }
    public void displaySortedDataById(){
        employeeListSortedById.addAll(employeeList);
        Collections.sort(employeeListSortedById, new SortById());
        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < employeeListSortedById.size(); i++) {
            System.out.println(employeeListSortedById.get(i));
        }
    }
    public void displaySortedDataBySalary(){
        employeeListSortedBySalary.addAll(employeeList);
        Collections.sort(employeeListSortedBySalary, new SortBySalary());
        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < employeeListSortedBySalary.size(); i++) {
            System.out.println(employeeListSortedBySalary.get(i));
        }
    }
}
