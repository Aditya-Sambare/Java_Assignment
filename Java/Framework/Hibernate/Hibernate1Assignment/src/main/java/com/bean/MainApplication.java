package com.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        Employee employee = new Employee();
//        System.out.println("Enter id \n name \n designation \n salary \n city");
//        employee.setEmpId(Integer.parseInt(bufferedReader.readLine()));
//        employee.setEmpName(bufferedReader.readLine());
//        employee.setEmpDesg(bufferedReader.readLine());
//        employee.setEmpSalary(Float.parseFloat(bufferedReader.readLine()));
//        employee.setEmpCity(bufferedReader.readLine());
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
//        int i = (int) session.save(employee);
//        if (i>0){
//            transaction.commit();
//            System.out.println("data inserted");
//        }else{
//            transaction.rollback();
//            System.out.println("something went wrong");
//        }
//        List<Employee> employeeList=session.createQuery("from com.bean.Employee").list();
//        System.out.println(employeeList);
//        int sum=0;
//        for(int j=0;j<employeeList.size();j++)
//        {
//            sum+=employeeList.get(j).getEmpSalary();
//        }
//        System.out.println(sum);
//
//
//        String city=bufferedReader.readLine();
//        List<Employee> employeeList1=session.createQuery("from com.bean.Employee where empCity ='"+city+"'").list();
//        System.out.println(employeeList1);
//
//
//
//        List<Employee> employeeList2=session.createQuery("from com.bean.Employee where empName like '%it%'").list();
//        System.out.println(employeeList2);

        Query q=session.createQuery("update com.bean.Employee set empSalary=empSalary+5000 where empSalary>20000");
         q.executeUpdate();
        List<Employee> employeeList=session.createQuery("from com.bean.Employee").list();
        System.out.println(employeeList);

    }
}
