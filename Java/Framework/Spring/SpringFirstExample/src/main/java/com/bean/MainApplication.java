package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.printHello();
        System.out.println("======= using spring ========");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringBean.xml");
        HelloWorld  obj = (HelloWorld) applicationContext.getBean("hello");
        obj.printHello();

    }
}
