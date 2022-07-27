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
/*
"C:\Program Files\Java\jdk1.8.0_202\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\lib\idea_rt.jar=65343:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_202\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\rt.jar;C:\Users\coditas\Desktop\Java_Assignment\Java\CoreJava\CoreJava_Programs\out\production\CoreJava_Programs" Day7_CoreJava.Inheritance_Assignment
========================Employee 1 Details======================
salary for wage employee Aditya whose employee id is 101 and salary is : 1600

========================Employee 2 Details======================
salary for salesperson anuj whose employee id is 202 and salary is : 2300

========================Employee 3 Details======================
salary for manager abhi whose employee id is 301 and salary is : 300


Process finished with exit code 0

 */