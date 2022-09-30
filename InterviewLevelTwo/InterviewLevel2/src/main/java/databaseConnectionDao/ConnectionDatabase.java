package databaseConnectionDao;

import org.hibernate.SessionFactory;

public interface ConnectionDatabase {
SessionFactory getSessionFactory();
}
