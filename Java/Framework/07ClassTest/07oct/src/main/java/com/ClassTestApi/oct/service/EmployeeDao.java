package com.ClassTestApi.oct.service;

import com.ClassTestApi.oct.model.Employee;
import com.ClassTestApi.oct.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeDao {
   public List<Employee> fetchAllEmployee() {
       Session session = HibernateUtil.getSessionFactory().openSession();
        return session.createQuery("from Employee").list();
    }
    public void insertEmployee(Employee employee) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(employee);
        transaction.commit();
//        session.close();
    }
    public void deleteEmployee(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(session.get(Employee.class,id));
        transaction.commit();
        session.close();
    }
    public void updateEmployee(int id){
    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction transaction = session.beginTransaction();
       Employee employee =  session.get(Employee.class,id);
       int age = employee.getEmpAge();
       employee.setEmpAge(age+1);
       session.saveOrUpdate(employee);
        transaction.commit();
        session.close();
}
}
