package com.bean;

public class Employee {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void displayData(){
        System.out.println("this is employee data \nname is "
        +name+"\nage is "+age);
    }
}
