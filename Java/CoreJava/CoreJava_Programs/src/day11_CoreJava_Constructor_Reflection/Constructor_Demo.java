package day11_CoreJava_Constructor_Reflection;
class Teacher {
    private int id;
    private String name;
    private int salary;
    private String city;
    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                '}';
    }

    public Teacher(int id, String name, int salary, String city) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.city = city;

    }
}
class Asst_Teacher extends  Teacher{
    private int experince;
    private String position;

    public Asst_Teacher(int id, String name, int salary, String city, int experince, String position) {

        super(id, name, salary, city);
        this.experince = experince;
        this.position = position;
    }
}
public class Constructor_Demo {
    public static void main(String[] args) {
        Teacher constructor = new Teacher(121,"aditya",45000,"pune");
        System.out.println(constructor);
    }
}
