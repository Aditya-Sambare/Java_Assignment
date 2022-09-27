package dao;

import com.bean.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class StudentDao {
    Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
    SessionFactory sessionFactory = configuration.buildSessionFactory();
BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
public void insertRecord() throws IOException {
    Session session = sessionFactory.openSession();
    Transaction transaction = session.beginTransaction();
    Student student = new Student();
    System.out.println("ENTER ID \nENTER NAME\nENTER CITY\nENTER AGE");
    int id = Integer.parseInt(bufferedReader.readLine());
    String name = bufferedReader.readLine();
    String city = bufferedReader.readLine();
    int age = Integer.parseInt(bufferedReader.readLine());
    student.setId(id);
    student.setName(name);
    student.setCity(city);
    student.setAge(age);
int t = (int) session.save(student);
if (t > 0){
    System.out.println("Record Inserted");
    transaction.commit();
}else{
    System.out.println("Something Went Wrong");
    transaction.rollback();
}
}
public void fetchRecords(){
    Session session = sessionFactory.openSession();
    Transaction transaction = session.beginTransaction();
    List<Student> studentList=session.createQuery("from Student").list();
    System.out.println(studentList);
}
public void updateRecords() throws IOException {
    System.out.println("Enter id for which you want to update");
    int id = Integer.parseInt(bufferedReader.readLine());
    System.out.println("Enter the updated age");
    int age = Integer.parseInt(bufferedReader.readLine());
    Session session = sessionFactory.openSession();
    Transaction transaction = session.beginTransaction();
    Query query =session.createQuery("update Student set age=:n where id=:i");
    query.setParameter("n",age);
    query.setParameter("i",id);
    int status=query.executeUpdate();
    if (status > 0) {
        System.out.println("Record updated");
        transaction.commit();
    }else{
        System.out.println("Something Went Wrong");
    }
}
public void deleteRecords() throws IOException {
    Session session = sessionFactory.openSession();
    Transaction transaction = session.beginTransaction();
    System.out.println("Enter id for which you want to update");
    int id = Integer.parseInt(bufferedReader.readLine());
    Query query =session.createQuery("delete Student where id=:n");
    query.setParameter("n",id);
    int status = query.executeUpdate();
    if (status > 0 ){
        System.out.println("Record Deleted");
        transaction.commit();
    }else {
        System.out.println("Something went Wrong");
        transaction.rollback();
    }
}
}
