package databaseConnectionDao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryProvider {
    private static SessionFactory sessionFactory;
    private  SessionFactoryProvider(){
    }

    public  static SessionFactory getSessionFactoryMethod(){
        if(sessionFactory== null){
            Configuration configuration = new Configuration().configure("hibernate.configuration.xml");
            sessionFactory = configuration.buildSessionFactory();
        }
        return sessionFactory;
    }
}
