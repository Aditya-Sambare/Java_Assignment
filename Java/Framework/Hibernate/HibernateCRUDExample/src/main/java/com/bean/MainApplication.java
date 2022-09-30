package com.bean;

import com.bean.manytomany.Employee;
import com.bean.manytomany.Project;
import com.bean.onetomany.Answer1;
import com.bean.onetomany.Question1;
import com.bean.onetoone.Answer;
import com.bean.onetoone.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) throws IOException {

        //CRUD WITH HIBERNATE
Menu menu = new Menu();
menu.showMenu();

        //ONE TO ONE RELATION MAPPING
//        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        Question question = new Question();
//        question.setQuestionId(1);
//        question.setQuestion("who are you");
//        Answer answer = new Answer1();
//        answer.setAnswerId(22);
//        answer.setAnswer("Aditya");
//        answer.setQuestion(question);
//        question.setAnswer(answer);
//        session.save(question);
//        session.save(answer);
//        transaction.commit();
//        Question question1 = (Question) session.get(Question.class,1);
//        System.out.println(question1.getQuestion());
//        System.out.println(question1.getAnswer().getAnswer());

        //ONE TO MANY RELATION MAPPING
//        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        Question1 question1 = new Question1();
//        question1.setQuestionID(111);
//        question1.setQuestion("who are java peoples");
//        List<Answer1> answer1List = new ArrayList<>();
//        Answer1 answer1 = new Answer1();
//        answer1.setAnswerID(1);
//        answer1.setAnswer("Aditya");
//        answer1.setQuestion(question1);
//        Answer1 answer2 = new Answer1();
//        answer2.setAnswerID(2);
//        answer2.setAnswer("dubey");
//        answer2.setQuestion(question1);
//        Answer1 answer3 = new Answer1();
//        answer3.setAnswerID(3);
//        answer3.setAnswer("anuj");
//        answer3.setQuestion(question1);
//        answer1List.add(answer1);
//        answer1List.add(answer2);
//        answer1List.add(answer3);
//        question1.setAnswers(answer1List);
//        session.save(question1);
//        session.save(answer1);
//        session.save(answer2);
//        session.save(answer3);
//        transaction.commit();
//        Question1 question11 = new Question1();
//        question11 = session.get(Question1.class,111);
//        System.out.println(question11.getQuestion());
//        for (Answer1 a : question11.getAnswers()){
//            System.out.println(a.getAnswer());
//        }


        //MANY TO MANY
//        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        Employee employee2 = new Employee();
//        Employee employee1 = new Employee();
//        Employee employee3 = new Employee();
//        Project project1 = new Project();
//        Project project2 = new Project();
//        Project project3 = new Project();
//        employee1.setEmployeeid(1);
//        employee1.setEmployeename("Aditya");
//
//        employee2.setEmployeeid(2);
//        employee2.setEmployeename("Dubey");
//
//        employee3.setEmployeeid(3);
//        employee3.setEmployeename("Anuj");
//
//        List<Employee> employeeList = new ArrayList<>();
//        List<Employee> employeeList1 = new ArrayList<>();
//        employeeList.add(employee1);
//        employeeList.add(employee2);
//        employeeList1.add(employee1);
//        employeeList1.add(employee3);
//        project1.setProjectid(11);
//        project1.setProjectname("Ambry");
//        project1.setEmployees(employeeList);
//        project2.setProjectid(122);
//        project2.setProjectname("R&R");
//        project2.setEmployees(employeeList1);
//        project3.setProjectid(22);
//        project3.setProjectname("Tavisca");
//        project3.setEmployees(employeeList);
//        List<Project> projectList1 = new ArrayList<>();
//        projectList1.add(project1);
//        projectList1.add(project3);
//        List<Project> projectList2 = new ArrayList<>();
//        projectList2.add(project2);
//        projectList2.add(project3);
//        employee1.setProjects(projectList1);
//        employee2.setProjects(projectList2);
//        employee3.setProjects(projectList1);
//        session.save(employee1);
//        session.save(employee2);
//        session.save(employee3);
//        session.save(project1);
//        session.save(project2);
//        session.save(project3);
//        transaction.commit();
//        Employee employee = new Employee();
//        employee = session.get(Employee.class,1);
//        System.out.println(employee.getEmployeename());
//        for (Project p : employee.getProjects()){
//            System.out.println(p.getProjectname());
//        }
    }
}
