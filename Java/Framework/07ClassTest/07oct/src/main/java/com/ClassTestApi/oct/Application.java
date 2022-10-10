package com.ClassTestApi.oct;

import com.ClassTestApi.oct.model.Department;
import com.ClassTestApi.oct.model.Employee;
import com.ClassTestApi.oct.util.HibernateUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
//		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//		Session session = sessionFactory.openSession();
//
//		Department department = new Department();
//		department.setDeptId(12);
//		department.setDeptName("java");
//		session.beginTransaction();
//		session.save(department);
//		session.getTransaction().commit();
//		Employee employee = new Employee();
//		employee.setEmpId(11);
//		employee.setEmpName("Aditya");
//		employee.setEmpAge(22);
//		employee.setDepartment(department);
//		session.save(employee);
//		session.getTransaction().commit();
//		session.close();
	}

}
