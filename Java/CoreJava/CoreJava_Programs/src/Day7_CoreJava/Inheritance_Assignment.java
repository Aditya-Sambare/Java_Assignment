package Day7_CoreJava;
import java.util.Scanner;
/**1. Create class WageEmployee extending Employee class with attributes as hrs (int)and
 rate(int) and method computeSalary) to calculate the salary
 Print the salary and details of WageEmployee. (Note: Use the previous Employee classes
 Accept the values from the user. Default, Parameterised Constructor and toString() to be written
 in all the classes
 2. Create SalesPerson class extending WageEmployee with attributes as sales(int) and
 commission (int).
 Override the ComputeSalary0]in Salesperson class and print the salary and details of
 SalesPerson
 3. Create Manager class extending Employee class with attributes as fixed salary(int) and
 incentives(int) and method compute Salary() to calculate the salary of Manager Print the salary
 and details of Manager
 4. Write a TestEmployee class to print the details of all types of employees (use array[] of
 Employee class) */
class Employee {
    int employeeID;
    String employeeName;
    Employee(int empId, String empName) {
        this.employeeID = empId;
        this.employeeName = empName;
    }
    void computeSalary() {
    }
}
     class WageEmployee extends Employee {
        int hrs;
        int rate;
        WageEmployee(int hrs, int rate, int empId, String empName) {
            super(empId, empName);
            this.hrs = hrs;
            this.rate = rate;
        }
        public void computeSalary() {
            int salary = rate * hrs;
            System.out.println("salary for wage employee " + employeeName + " whose employee id is " + employeeID + " and salary is : " + salary);
            System.out.println();
        }
    }
    class SalesPerson extends WageEmployee {
        int sales;
        int commision;
        public void computeSalary() {
            int salary = sales + commision + (hrs * rate);
            System.out.println("salary for salesperson " + employeeName + " whose employee id is " + employeeID + " and salary is : " + salary);
            System.out.println();
        }
        SalesPerson(int hrs, int rate, int empId, String empName, int sales, int commision) {
            super(hrs, rate, empId, empName);
            this.sales = sales;
            this.commision = commision;
        }
    }
    class Manager extends Employee {
        int fixedSalary;
        int incentive;

        public void computeSalary() {
            int salary = fixedSalary + incentive;
            System.out.println("salary for manager " + employeeName + " whose employee id is " + employeeID + " and salary is : " + salary);
            System.out.println();
        }
        Manager(int empId, String empName, int fixedSalary, int incentive) {
            super(empId, empName);
            this.incentive = incentive;
            this.fixedSalary = fixedSalary;
        }
    }
class Employee_Test{
    public void display(){
        Employee employee[] = new Employee[3];

        employee[0] =new WageEmployee(8,200,101,"Aditya");
        employee[1] = new SalesPerson(10,200,202,"anuj",100,200);
        employee[2] = new Manager(301,"abhi",100,200);
        for (int i=0;i<employee.length;i++) {
            System.out.println("========================Employee " + (i + 1) + " Details======================");
            employee[i].computeSalary();
        }
    }
}
public class Inheritance_Assignment {
    public static void main(String[] args) {
      new Employee_Test().display();
    }
}