package com.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainApplication {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Book name\nEnter Author name\nEnter Book price");
        Book book = new Book();

        book.setBook_name(bufferedReader.readLine());
        book.setAuthor_name(bufferedReader.readLine());
        book.setPublisher_name(bufferedReader.readLine());
        book.setPrice(Float.parseFloat(bufferedReader.readLine()));

        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        int i = (int) session.save(book);
        if (i>0){
            transaction.commit();
            System.out.println("Data inserted");
        }else{
            transaction.rollback();
            System.out.println("Something Went Wrong");
        }
    }
}
