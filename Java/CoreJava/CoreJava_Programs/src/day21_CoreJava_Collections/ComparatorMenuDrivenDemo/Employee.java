package day21_CoreJava_Collections.ComparatorMenuDrivenDemo;

public class Employee {
    int employeeId;
    String employeeName;
    String employeeCity;
    int employeeSalary;

    public Employee(int employeeId, String employeeName, String employeeCity, int employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeCity = employeeCity;
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeCity='" + employeeCity + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }
}
