package daoClasses;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    private int employeeId;
    private String employeeName;
    private int employeeAge;
    private int employeeSalary;
    private String employeeDesignation;
    private String employeeAddress;
    private String employeeExperince;
    private String employeePhotoUrl;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getEmployeeExperince() {
        return employeeExperince;
    }

    public void setEmployeeExperince(String employeeExperince) {
        this.employeeExperince = employeeExperince;
    }

    public String getEmployeePhotoUrl() {
        return employeePhotoUrl;
    }

    public void setEmployeePhotoUrl(String employeePhotoUrl) {
        this.employeePhotoUrl = employeePhotoUrl;
    }

    public Employee(int employeeId, String employeeName, int employeeAge, int employeeSalary, String employeeDesignation, String employeeAddress, String employeeExperince, String employeePhotoUrl) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeSalary = employeeSalary;
        this.employeeDesignation = employeeDesignation;
        this.employeeAddress = employeeAddress;
        this.employeeExperince = employeeExperince;
        this.employeePhotoUrl = employeePhotoUrl;
    }

    public Employee() {
    }
}
