package controller;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Connection {
   static Configuration configuration;
   static SessionFactory sessionFactory;
   public static SessionFactory getConnection()
   {
      if(sessionFactory==null)
      {
        configuration = new Configuration().configure("hibernate.cfg.xml");
        sessionFactory = configuration.buildSessionFactory();
      }
      return sessionFactory;
   }
}
