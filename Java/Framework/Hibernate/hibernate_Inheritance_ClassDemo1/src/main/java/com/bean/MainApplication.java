package com.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApplication {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure("hbm.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Employee employee = new Employee(1,"Aditya");
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(2,"Anuj",8,400);
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(3,"Dubey",2000,4,400);
        session.save(employee);
        session.save(partTimeEmployee);
        session.save(fullTimeEmployee);
        transaction.commit();

    }
}