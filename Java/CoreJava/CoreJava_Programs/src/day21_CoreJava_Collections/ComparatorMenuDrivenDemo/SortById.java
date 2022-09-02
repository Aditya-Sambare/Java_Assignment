package day21_CoreJava_Collections.ComparatorMenuDrivenDemo;

import java.util.Comparator;

public class SortById implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.employeeId-o2.employeeId;
    }
}
