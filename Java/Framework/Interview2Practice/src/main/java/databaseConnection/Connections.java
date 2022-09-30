package databaseConnection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Connections {
    public static SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        return sessionFactory;
    }
}
