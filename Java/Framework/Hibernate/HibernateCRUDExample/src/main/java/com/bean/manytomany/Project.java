package com.bean.manytomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;
@Entity
public class Project {
    @Id
    int projectid;
    String projectname;
    @ManyToMany
    List<Employee> employees;

    public Project() {

    }

    public Project(int projectid, String projectname, List<Employee> employees) {
        this.projectid = projectid;
        this.projectname = projectname;
        this.employees = employees;
    }

    public int getProjectid() {
        return projectid;
    }

    public void setProjectid(int projectid) {
        this.projectid = projectid;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
