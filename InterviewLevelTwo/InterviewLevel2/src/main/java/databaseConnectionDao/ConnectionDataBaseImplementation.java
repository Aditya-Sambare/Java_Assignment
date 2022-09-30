package databaseConnectionDao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnectionDataBaseImplementation implements ConnectionDatabase{

    @Override
    public SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration().configure("hibernate.configuration.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        return sessionFactory;
    }
}
