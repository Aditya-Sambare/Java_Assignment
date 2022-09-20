package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ByType.xml");
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ByType.xml");
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student);
        System.out.println("***********************************************************************************");
        Employee employee = (Employee) applicationContext.getBean("employee");
        System.out.println(employee);
    }
}
