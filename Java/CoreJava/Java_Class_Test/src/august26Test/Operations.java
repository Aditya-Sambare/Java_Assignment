package august26Test;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import java.util.*;
import java.util.stream.Collectors;
public class Operations {
    public List<Employee> employeeList = new ArrayList<>();
    public List<Employee> employeeListSortedByName = new ArrayList<>();
    public List<Employee> employeeListSortedByCity = new ArrayList<>();
    public List<Employee> employeeListSortedBySalary = new ArrayList<>();
    public List namesList = new ArrayList<>();
    void insertData(){
        employeeList.add(new Employee(1,"aditya","pune",441101,45000,1));
        employeeList.add(new Employee(2,"anuj","dehradun",31421,44000,3));
        employeeList.add(new Employee(4,"abhishek","pune",441101,43000,1));
        employeeList.add(new Employee(3,"dev","bhopal",441101,46000,2));
    }
    public void displaySortedDataByName(){
        employeeListSortedByName.addAll(employeeList);
        Collections.sort(employeeListSortedByName, new SortByName());
        for (int i = 0; i < employeeListSortedByName.size(); i++) {
            System.out.println(employeeListSortedByName.get(i));
        }
    }
    public void displaySortedDataByCity(){
        employeeListSortedByCity.addAll(employeeList);
        Collections.sort(employeeListSortedByCity, new SortByCity());
        for (int i = 0; i < employeeListSortedByCity.size(); i++) {
            System.out.println(employeeListSortedByCity.get(i));
        }
    }
    public void displaySortedDataBySalary(){
        employeeListSortedBySalary.addAll(employeeList);
        Collections.sort(employeeListSortedBySalary, new SortBySalary());
        for (int i = 0; i < employeeListSortedBySalary.size(); i++) {
            System.out.println(employeeListSortedBySalary.get(i));
        }
    }
    void displayNamesLengthMoreThan5(){
        namesList = employeeList.stream().filter(employee -> employee.name.length()>5).collect(Collectors.toList());
        namesList.forEach((a)-> System.out.println(a));
    }
    void sortBySalaryAndCity(){
       List<Employee> sortedListByCityAndSalary =  employeeList.stream().filter(s->s.getCity().equals("pune")).filter(s->s.getSalary()>10000).
                sorted(Comparator.comparing(s->s.getSalary())).sorted(Comparator.comparing(s->s.getCity())).collect(Collectors.toList());
        for (Employee e : sortedListByCityAndSalary){
            System.out.println(e);
        }
    }

}
