package hibernateApplication;

import com.bean.*;
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
////Practice of Diffrent Annotations in hibernate
//        DiffrentAnnotationsInHibernate diffrentAnnotationsInHibernate = new DiffrentAnnotationsInHibernate();
//        diffrentAnnotationsInHibernate.setName("Aditya");
//        diffrentAnnotationsInHibernate.setTransientMessage("do not display this");
//        diffrentAnnotationsInHibernate.setDate(new Date());
//        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\coditas\\Desktop\\Java_Assignment\\Java\\Framework\\Hibernate\\CompleteHibernatePractice1\\src\\main\\java\\dog.jpg");
//        byte [] img = new byte[fileInputStream.available()];
//        fileInputStream.read(img);
//        diffrentAnnotationsInHibernate.setImage(img);
//        System.out.println(diffrentAnnotationsInHibernate);
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//        session.save(diffrentAnnotationsInHibernate);
//        session.getTransaction().commit();
//        session.close();
//====================================================================================================================
////fetch the object from data base using get and load method
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//        FetchObjectFromDatabaseUsingGetAndLoadMethod fetchObjectFromDatabaseUsingGetAndLoadMethod = new FetchObjectFromDatabaseUsingGetAndLoadMethod(121,"Aditya","malkapur");
//        FetchObjectFromDatabaseUsingGetAndLoadMethod fetchObjectFromDatabaseUsingGetAndLoadMethod1 = new FetchObjectFromDatabaseUsingGetAndLoadMethod(111,"Advait","pune");
//        //session.save(fetchObjectFromDatabaseUsingGetAndLoadMethod1);
//        //session.save(fetchObjectFromDatabaseUsingGetAndLoadMethod);
//        //session.getTransaction().commit();
//        FetchObjectFromDatabaseUsingGetAndLoadMethod obj = session.get(FetchObjectFromDatabaseUsingGetAndLoadMethod.class,1);
//        FetchObjectFromDatabaseUsingGetAndLoadMethod obj1 = session.load(FetchObjectFromDatabaseUsingGetAndLoadMethod.class,2);
//        System.out.println(obj);
//        System.out.println(obj1);
//==========================================================================================================================
////Embeddable example
//        EmbedableDemo embedableDemo = new EmbedableDemo(1,"this is embeded");
//        EmbedableDemo embedableDemo1 = new EmbedableDemo(2,"this is also embeded");
//        EmbedableClass embedableClass = new EmbedableClass(1,"aditya",embedableDemo);
//        EmbedableClass embedableClass1 = new EmbedableClass(2,"advait",embedableDemo1);
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//        session.save(embedableClass);
//        session.save(embedableClass1);
//        session.getTransaction().commit();
//        session.close();
    }
}
