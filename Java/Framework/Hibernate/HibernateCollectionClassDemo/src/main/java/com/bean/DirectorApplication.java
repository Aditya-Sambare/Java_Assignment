//package com.bean;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//import java.util.HashSet;
//
//public class DirectorApplication {
//    public static void main(String[] args) {
//        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        Director director = new Director();
//        director.setId(121);
//        director.setName("sanjay leela bhansali");
//        HashSet<Movie> hashSet = new HashSet<>();
//        hashSet.add(new Movie(1,"RamLeela"));
//        hashSet.add(new Movie(2,"Padmavat"));
//        hashSet.add(new Movie(3,"BajiRao Mastani"));
//        director.setMovies(hashSet);
//        System.out.println("===================================================================");
//        Director director1 = new Director();
//        director1.setId(123);
//        director1.setName("karan johar");
//        HashSet<Movie> hashSet1 = new HashSet<>();
//        hashSet1.add(new Movie(1,"DDLJ"));
//        hashSet1.add(new Movie(2,"Soty"));
//        hashSet1.add(new Movie(3,"Mohabatien"));
//
//
//    }
//}
