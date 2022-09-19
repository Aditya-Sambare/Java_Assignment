package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Bean.xml");
        Triangle triangle = (Triangle) applicationContext.getBean("triangle");
        Circle circle = (Circle) applicationContext.getBean("circle");

        triangle.Area();
        circle.Area();
    }
}
