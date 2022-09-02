package august26Test;

import java.util.Comparator;

public class SortByCity implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.city.compareTo(o2.city);
    }
}
