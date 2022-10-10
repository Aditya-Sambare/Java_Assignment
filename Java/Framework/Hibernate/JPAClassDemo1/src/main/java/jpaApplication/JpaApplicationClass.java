package jpaApplication;

import com.bean.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaApplicationClass {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aditya");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Student student = new Student();
        student.setStudentName("Aditya");
        student.setDepartment("Computer Science");
        entityManager.getTransaction().begin();

        entityManager.persist(student);
        entityManager.getTransaction().commit();

    }
}
