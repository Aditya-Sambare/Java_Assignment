package com.Project.EmployeeProject.services;

import com.Project.EmployeeProject.entity.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.HashMap;

public interface Service {


      public HashMap<Integer, String> fetchUserIdAndName();

      public Employee fetchParticularUserDetails(int id);

}
