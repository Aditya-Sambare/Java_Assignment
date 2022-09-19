package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringConstructor.xml");
        Employee employee = (Employee) applicationContext.getBean("employee");
        employee.displayData();
    }
}
