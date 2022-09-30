package com.Project.EmployeeProject.entity;

public class EmployeeIdName {
int id;
String name;

    public EmployeeIdName() {
    }

    public EmployeeIdName(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EmployeeIdName{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
