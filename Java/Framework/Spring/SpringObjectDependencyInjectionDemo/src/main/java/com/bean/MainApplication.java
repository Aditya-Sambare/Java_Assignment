package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {


       // ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringDemo.xml");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("InnerBean.xml");
        Shape shape = (Shape) applicationContext.getBean("shape");
        shape.display();
    }
}