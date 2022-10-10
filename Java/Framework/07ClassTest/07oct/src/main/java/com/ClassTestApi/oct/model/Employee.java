package com.ClassTestApi.oct.model;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    public int empId;
    public String empName;
    public int empAge;
    @OneToOne(cascade = CascadeType.ALL)
    public Department department;

    public Employee() {
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
