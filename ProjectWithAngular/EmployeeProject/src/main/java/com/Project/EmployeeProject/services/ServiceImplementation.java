package com.Project.EmployeeProject.services;

import com.Project.EmployeeProject.entity.Employee;
import controller.Connection;
import org.hibernate.Session;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImplementation implements Service {

    @Override
    public HashMap<Integer,String> fetchUserIdAndName() {
        System.out.println("User Data");
        List<Employee> employeelist = new ArrayList<>();
        HashMap<Integer,String> employeeIdNamesList = new HashMap<>();
        Session session = Connection.getConnection().openSession();
        // Transaction transaction = session.beginTransaction();
        employeelist = session.createQuery("from Employee").list();
        for (Employee e : employeelist){
            employeeIdNamesList.put(e.getEmployeeId(), e.getEmployeeName());
        }
        System.out.println("User Data");
        return employeeIdNamesList;
    }

    @Override
    public Employee fetchParticularUserDetails(int id) {
        Session session = Connection.getConnection().openSession();
        //Transaction transaction = session.beginTransaction();
        Employee employee = session.get(Employee.class,id);
        return employee;
    }
}
