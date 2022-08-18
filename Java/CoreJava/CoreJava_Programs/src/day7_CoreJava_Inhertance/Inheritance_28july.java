package day7_CoreJava_Inhertance;

import java.util.Scanner;
class Employee_Class{
    int employee_Id;
    String employee_Name;
    int employee_salary;
    String employee_address;
    Employee_Class(int employee_Id,String employee_Name,int employee_salary,String employee_address){
        this.employee_Id = employee_Id;
        this.employee_Name = employee_Name;
        this.employee_salary = employee_salary;
        this.employee_address = employee_address;
    }

    @Override
    public String toString() {
        return "Employee_Class{" +
                "employee_Id=" + employee_Id +
                ", employee_Name='" + employee_Name + '\'' +
                ", employee_salary=" + employee_salary +
                ", employee_address='" + employee_address + '\'' +
                '}';
    }
}
class Insert_Records{
    public void insert(){
        Scanner sc = new Scanner(System.in);
        System.out.println("how many records you want to enter");
        int n = sc.nextInt();
        Employee_Class employee_class=null;
        Employee_Class employee[] = new Employee_Class[n];
        for (int i = 0 ; i < n ; i++){

            System.out.println("insert recods for employee "+i);
            System.out.println("enter employee id");
            int empId = sc.nextInt();
            System.out.println("enter employee name");
            String empName = sc.next();
            System.out.println("enter employee salary");
            int empSalary = sc.nextInt();
            System.out.println("enter employee address");
            String empAddress = sc.next();
            employee_class = new Employee_Class(empId,empName,empSalary,empAddress);
            employee [i] = employee_class;
        }
        for (int i=0;i<employee.length;i++) {
            System.out.println(employee[i]);
        }
    }
}

public class Inheritance_28july {
    public static void main(String[] args) {
        Insert_Records insert_records = new Insert_Records();
        insert_records.insert();

    }
}
