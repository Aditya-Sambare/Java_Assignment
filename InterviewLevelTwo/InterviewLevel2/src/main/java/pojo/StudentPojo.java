package pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.security.auth.Subject;
import java.util.List;

@Entity
public class StudentPojo {
    @Id
    int studentId;
    String studentName;
    @OneToMany
    List<SubjectPojo> subjects;

    public StudentPojo() {
    }

    public StudentPojo(int studentId, String studentName, List<SubjectPojo> subjects) {
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

    public List<SubjectPojo> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<SubjectPojo> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "StudentPojo{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
