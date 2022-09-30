package com.bean;

import com.bean.Employee;

import javax.persistence.Entity;

@Entity
public class FullTimeEmployee extends Employee {
    int fixSalary,extraNoOfHrs,extraHrsSalary;

    public FullTimeEmployee(int id, String name, int fixSalary, int extraNoOfHrs, int extraHrsSalary) {
        super(id, name);
        this.fixSalary = fixSalary;
        this.extraNoOfHrs = extraNoOfHrs;
        this.extraHrsSalary = extraHrsSalary;
    }

    public int getFixSalary() {
        return fixSalary;
    }

    public void setFixSalary(int fixSalary) {
        this.fixSalary = fixSalary;
    }

    public int getExtraNoOfHrs() {
        return extraNoOfHrs;
    }

    public void setExtraNoOfHrs(int extraNoOfHrs) {
        this.extraNoOfHrs = extraNoOfHrs;
    }

    public int getExtraHrsSalary() {
        return extraHrsSalary;
    }

    public void setExtraHrsSalary(int extraHrsSalary) {
        this.extraHrsSalary = extraHrsSalary;
    }

    @Override
    public String toString() {
        return "com.bean.FullTimeEmployee{" +
                "fixSalary=" + fixSalary +
                ", extraNoOfHrs=" + extraNoOfHrs +
                ", extraHrsSalary=" + extraHrsSalary +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
