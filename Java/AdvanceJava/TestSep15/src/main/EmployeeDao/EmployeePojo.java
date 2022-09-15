package EmployeeDao;

public class EmployeePojo {
    int id;
    String password;
    String name;
    String address;
    int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public EmployeePojo(int id, String password, String name, String address, int age) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    @Override
    public String toString() {
        return "EmployeePojo{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
