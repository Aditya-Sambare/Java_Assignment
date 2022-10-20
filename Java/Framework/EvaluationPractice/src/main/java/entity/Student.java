package entity;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Student {
    @Id
    int studentId;
    String studentName;
    @ManyToMany
    @Cascade(CascadeType.PERSIST)
    List<Subject> subjects;
    @OneToMany
    List<Marks> marks;

    public Student() {
    }

    public Student(int studentId, String studentName, List<Subject> subjects) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.subjects = subjects;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
