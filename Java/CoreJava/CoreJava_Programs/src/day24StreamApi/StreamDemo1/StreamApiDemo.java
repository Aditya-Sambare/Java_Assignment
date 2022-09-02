package day24StreamApi.StreamDemo1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamApiDemo {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Aditya","Sambare",45000d, Stream.of("ambry","capstone").collect(Collectors.toList())));
        employeeList.add(new Employee("Anuj","Sundriyal",40000d, Stream.of("tavisca","capstone").collect(Collectors.toList())));
        employeeList.add(new Employee("Omkar","Kulkarni",41000d, Stream.of("invicro","capstone").collect(Collectors.toList())));
        employeeList.add(new Employee("Abhay","Zodape",42000d, Stream.of("tavisca","capstone").collect(Collectors.toList())));
        employeeList.add(new Employee("Ayush","Naphade",43000d, Stream.of("ambry","capstone").collect(Collectors.toList())));
        employeeList.add(new Employee("Abhishek","Banarjee",46000d, Stream.of("invicro","capstone").collect(Collectors.toList())));
        //Stream.of(employeeList); //way one
        //for each
        System.out.println("------------------------------------------------prints the employee list------------------------------------------------------------------------");
        employeeList.stream() //way two
                .forEach(employee -> System.out.println(employee));
        //map
        //collect
        List<Employee> increasedSalary = employeeList.stream().map(employee -> new Employee(
                employee.getFirstName(),
                employee.getLastName(),
                employee.getSalary()*1.10,
                employee.getProjects()
        )).collect(Collectors.toList());
        //print the increased salary list
        System.out.println("------------------------------------------------print the increased salary list------------------------------------------------------------------------");
        increasedSalary.stream().forEach(employee -> System.out.println(employee));
        //map
        //collect
        //filter
        List<Employee> salaryGreaterThan43000 = increasedSalary.stream().filter(employee -> employee.getSalary()>47000)
                .map(employee -> new Employee(employee.getFirstName(), employee.getLastName()
                        ,employee.getSalary(),employee.getProjects())).collect(Collectors.toList());
        //print the salaryGreaterThan43000 list
        System.out.println("------------------------------------------------print the salaryGreaterThan47000 list------------------------------------------------------------------------");
        salaryGreaterThan43000.forEach(a-> System.out.println(a));


    }
}
