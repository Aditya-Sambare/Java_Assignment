package Services;

import databaseConnectionDao.SessionFactoryProvider;
import entity.Marks;
import entity.Student;
import entity.Subject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.Query;
import java.util.List;

public class DatabaseServicesImplementation implements DatabaseServices {
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactoryMethod();
    @Override
    public void insertStudent(Student student) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        session.close();
    }
    public void insertSubject(int studentId , Subject subject){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Student student = session.get(Student.class,studentId);
        List<Subject> subjects= student.getSubjects();
        subjects.add(subject);
        session.saveOrUpdate(student);
        session.getTransaction().commit();
        session.close();
    }
    public void insertMarks(Marks marks){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(marks);
        session.getTransaction().commit();
        session.close();
    }
    public void deleteStudent(int studentId){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Query query = session.createQuery("delete from Marks where studentId=:i");
        query.setParameter("i",studentId);
        query.executeUpdate();
        Student student =session.get(Student.class,studentId);
        session.delete(student);
        session.getTransaction().commit();
        session.close();
    }
    public void updateMarks(int studentId, int subjectId, int mark, String status) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Query query = session.createQuery("from Marks where studentId=:stuId and subjectId=:subId");
        query.setParameter("stuId", studentId);
        query.setParameter("subId", subjectId);
        List<Marks> marks = query.getResultList();
        Marks marks1 = marks.get(0);
        marks1.setStatus(status);
        marks1.setMarks(mark);
        session.saveOrUpdate(marks1);
        session.getTransaction().commit();
        session.close();
    }

    public Student printStudents(int studentId) {
        Session session = sessionFactory.openSession();
        Student student = session.get(Student.class, studentId);
        return student;
        }
}