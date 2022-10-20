package Services;

import entity.Marks;
import entity.Student;
import entity.Subject;

public interface DatabaseServices {
    public void insertStudent(Student student);
    public void insertSubject(int studentId , Subject subject);
    public void insertMarks(Marks marks);
    public void deleteStudent(int studentId);
    public Student printStudents(int studentId);
    public void updateMarks(int studentId, int subjectId, int mark, String status);

}
