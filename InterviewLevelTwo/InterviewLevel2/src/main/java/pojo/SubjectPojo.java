package pojo;

import javax.persistence.*;

@Entity
public class SubjectPojo {
    @Id
    String subjectName;
    int marks;
    String status;
    int studentId;

    public SubjectPojo() {
    }

    public SubjectPojo(String subjectName, int marks, String status, int studentId) {
        this.subjectName = subjectName;
        this.marks = marks;
        this.status = status;
        //this.studentId = studentId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "SubjectPojo{" +
                "subjectName='" + subjectName + '\'' +
                ", marks=" + marks +
                ", status='" + status + '\'' +
                ", studentId='" + studentId + '\'' +
                '}';
    }
}
