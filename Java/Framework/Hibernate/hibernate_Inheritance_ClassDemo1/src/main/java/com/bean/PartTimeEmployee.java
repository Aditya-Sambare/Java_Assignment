package com.bean;

import com.bean.Employee;

import javax.persistence.Entity;

@Entity
public class PartTimeEmployee extends Employee {
    int noOfHrs,salaryPerHour;

    public PartTimeEmployee(int id, String name, int noOfHrs, int salaryPerHour) {
        super(id, name);
        this.noOfHrs = noOfHrs;
        this.salaryPerHour = salaryPerHour;
    }

    public int getNoOfHrs() {
        return noOfHrs;
    }

    public void setNoOfHrs(int noOfHrs) {
        this.noOfHrs = noOfHrs;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    @Override
    public String toString() {
        return "com.bean.PartTimeEmployee{" +
                "noOfHrs=" + noOfHrs +
                ", salaryPerHour=" + salaryPerHour +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
