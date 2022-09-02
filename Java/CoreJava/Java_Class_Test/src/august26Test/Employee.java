package august26Test;

public class Employee {
    int id;
    String name;
    String city;
    int pincode;
    int salary;
    float experience;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", pincode=" + pincode +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }

    public Employee(int id, String name, String city, int pincode, int salary, float experience) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.pincode = pincode;
        this.salary = salary;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }
}
