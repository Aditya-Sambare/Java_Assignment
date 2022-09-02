package CollectionWithFileHandling;

public class Doctor extends Staff{
    int experince;
    String designation;

    public Doctor(int id, String name, int age, int salary, int experince, String designation) {
        super(id, name, age, salary);
        this.experince = experince;
        this.designation = designation;
    }

    public int getExperince() {
        return experince;
    }

    public void setExperince(int experince) {
        this.experince = experince;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String
    toString() {
        return "Doctor{" +
                "experince=" + experince +
                ", designation='" + designation + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
