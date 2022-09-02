package august26Test;
public class Test {
    public static void main(String[] args) {
Operations operations = new Operations();
operations.insertData();
        System.out.println("----------------------------------------Sorted by city----------------------------------------------");

operations.displaySortedDataByCity();
        System.out.println("-------------------------------------------Sorted by name-------------------------------------------");
operations.displaySortedDataByName();
        System.out.println("------------------------------------------------Sorted by salary--------------------------------------");

operations.displaySortedDataBySalary();
        System.out.println("---------------------------------Names length more than 5-----------------------------------------------");
operations.displayNamesLengthMoreThan5();
        System.out.println("----------------------------------sorted by salary greater than 10000 and city is pune-------------------------------");
    operations.sortBySalaryAndCity();}
}
