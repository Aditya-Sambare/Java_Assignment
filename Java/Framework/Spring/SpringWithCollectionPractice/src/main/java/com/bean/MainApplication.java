package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringDirector.xml");
        Director director1 = (Director) applicationContext.getBean("director1");
        Director director2 = (Director) applicationContext.getBean("director2");
        System.out.println(director1);
        System.out.println(director2);
    }
}
