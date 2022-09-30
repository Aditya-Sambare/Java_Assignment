package com.bean.manytomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;
@Entity
public class Employee {
    @Id
    int employeeid;
    String employeename;
    @ManyToMany
    List<Project> projects;

    public Employee() {
    }

    public Employee(int employeeid, String employeename, List<Project> projects) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.projects = projects;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
