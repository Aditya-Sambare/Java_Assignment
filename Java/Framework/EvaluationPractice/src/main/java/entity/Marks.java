package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Marks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int marksId;
    int studentId;
    int subjectId;
    int marks;
    String status;

    public Marks() {
    }

    public Marks(int marksId, int studentId, int subjectId, int marks, String status) {
        this.marksId = marksId;
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.marks = marks;
        this.status = status;
    }

    public int getMarksId() {
        return marksId;
    }

    public void setMarksId(int marksId) {
        this.marksId = marksId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
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
        return "Marks{" +
                "marksId=" + marksId +
                ", studentId=" + studentId +
                ", subjectId=" + subjectId +
                ", marks=" + marks +
                ", status='" + status + '\'' +
                '}';
    }
}
