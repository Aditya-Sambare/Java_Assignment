package daoClasses;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OperationsWithDatabaseImplementation implements OperationsWithDataBase{
    Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
    SessionFactory sessionFactory = configuration.buildSessionFactory();
    @Override
    public HashMap<Integer,String> fetchUserIdAndName() {
        List<Employee> employeelist = new ArrayList<>();
        HashMap<Integer,String> employeeIdNameslist = new HashMap<>();
        Session session = sessionFactory.openSession();
       // Transaction transaction = session.beginTransaction();
        employeelist = session.createQuery("from Employee").list();
        for (Employee e : employeelist){
            employeeIdNameslist.put(e.getEmployeeId(),e.getEmployeeName());
        }
        return employeeIdNameslist;
    }

    @Override
    public Employee fetchParticularUserDetails(int id) {
        Session session = sessionFactory.openSession();
        //Transaction transaction = session.beginTransaction();
        Employee employee = session.get(Employee.class,id);
        return employee;
    }
}
