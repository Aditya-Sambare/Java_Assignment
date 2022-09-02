package day21_CoreJava_Collections.ComparatorMenuDrivenDemo;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.employeeSalary-o2.employeeSalary;
    }
}
