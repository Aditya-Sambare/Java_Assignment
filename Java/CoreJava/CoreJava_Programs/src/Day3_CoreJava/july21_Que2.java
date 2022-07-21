package Day3_CoreJava;
class EmployeeDetails{
    String empName = "Aditya"; //this is declaration and initialization of instance variable,
                                // and if we not initialize this the default value will get stored.
    static String companyAddress = "Viman Nagar, Pune"; //this is declaration and initialization of static variable,
                                                        // and if we not initialize this the default value will get stored.
                                                        //company address is declared as static here because it will be required throughout the program
    public void showDetails(){
        int empId = 102; //this is declaration and initialization of local variable,
                        // and if we not initialize this the default value will not get stored.
                        //emp id is declare as local because every emp will have diffrent id.
        System.out.println("Employee Details Are::");
        System.out.println("Company address is : "+companyAddress);
        System.out.println("Employee name is : "+empName);
        System.out.println("Employee Id is : "+empId);



    }

}
public class july21_Que2 {
    public static void main(String[] args) {
        EmployeeDetails employeeDetails = new EmployeeDetails();
        employeeDetails.showDetails();

    }
}
