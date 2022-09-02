package CollectionWithFileHandling;

public class Nurse extends Staff{
    String nurseType;
    int PatientAssigned;

    public Nurse(int id, String name, int age, int salary, String nurseType, int patientAssigned) {
        super(id, name, age, salary);
        this.nurseType = nurseType;
        PatientAssigned = patientAssigned;
    }

    public String getNurseType() {
        return nurseType;
    }

    public void setNurseType(String nurseType) {
        this.nurseType = nurseType;
    }

    public int getPatientAssigned() {
        return PatientAssigned;
    }

    public void setPatientAssigned(int patientAssigned) {
        PatientAssigned = patientAssigned;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "nurseType='" + nurseType + '\'' +
                ", PatientAssigned=" + PatientAssigned +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
