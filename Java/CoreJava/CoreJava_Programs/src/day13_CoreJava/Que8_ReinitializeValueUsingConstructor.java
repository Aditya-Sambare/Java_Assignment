package day13_CoreJava;

/**
 *  8)Using Constructor try to Reinitialize values of class
 *  Employee(emp_id,emp_name,emp_address, emp_sal)
 */
class Employee{
    int emp_id = 0;
    String emp_name = "null";
    int emp_sal = 0;
    String emp_address = "null";

    public Employee(int emp_id, String emp_name, int emp_sal, String emp_address) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_sal = emp_sal;
        this.emp_address = emp_address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", emp_sal=" + emp_sal +
                ", emp_address='" + emp_address + '\'' +
                '}';
    }
}
public class Que8_ReinitializeValueUsingConstructor {
    public static void main(String[] args) {
        Employee employee = new Employee(101,"aditya",45000,"viman nagar");
        System.out.println(employee);
    }
}
