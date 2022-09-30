package services;

import databaseConnectionDao.ConnectionDataBaseImplementation;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import pojo.StudentPojo;

public class StudentServices {
    public static String insertStudentRecord(StudentPojo student){
        ConnectionDataBaseImplementation connectionDataBaseImplementation = new ConnectionDataBaseImplementation();
        SessionFactory sessionFactory = connectionDataBaseImplementation.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.save(student);
        session.close();
        session.flush();
        return "Student Added";

    }
}
