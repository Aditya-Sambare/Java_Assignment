package hibernateApplication;

import com.bean.DiffrentAnnotationsInHibernate;
import com.bean.SaveFirstObjectInDataBase;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.*;
import java.util.Date;

public class HibernateBasicsApplicationClass {
    static Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
     static SessionFactory sessionFactory = configuration.buildSessionFactory();
    public static void main(String[] args) throws IOException {
////Saving first object in database with hibernate example
//        SaveFirstObjectInDataBase saveFirstObjectInDataBase = new SaveFirstObjectInDataBase(1,"Aditya",45000);
//        System.out.println(saveFirstObjectInDataBase);
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//        session.save(saveFirstObjectInDataBase);
//        session.getTransaction().commit();
//        session.close();
//=====================================================================================================================
//Practice of Diffrent Annotations in hibernate
        DiffrentAnnotationsInHibernate diffrentAnnotationsInHibernate = new DiffrentAnnotationsInHibernate();
        diffrentAnnotationsInHibernate.setName("Aditya");
        diffrentAnnotationsInHibernate.setTransientMessage("do not display this");
        diffrentAnnotationsInHibernate.setDate(new Date());
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\coditas\\Desktop\\Java_Assignment\\Java\\Framework\\Hibernate\\CompleteHibernatePractice1\\src\\main\\java\\dog.jpg");
        byte [] img = new byte[fileInputStream.available()];
        fileInputStream.read(img);
        diffrentAnnotationsInHibernate.setImage(img);
        System.out.println(diffrentAnnotationsInHibernate);
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(diffrentAnnotationsInHibernate);
        session.getTransaction().commit();
        session.close();
    }
}
