package pojo;

import javax.persistence.*;

@Entity
public class SubjectPojo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int subjectId;
    String subjectName;
    int marks;
    String status;
    @ManyToMany
    StudentPojo studentPojo;

    public SubjectPojo() {
    }

    public SubjectPojo(int subjectId, String subjectName, int marks, String status) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.marks = marks;
        this.status = status;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
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

    @Override
    public String toString() {
        return "SubjectPojo{" +
                "subjectId=" + subjectId +
                ", subjectName='" + subjectName + '\'' +
                ", marks=" + marks +
                ", status='" + status + '\'' +
                '}';
    }
}
