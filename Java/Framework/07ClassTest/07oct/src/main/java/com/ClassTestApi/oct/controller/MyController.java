package com.ClassTestApi.oct.controller;

import com.ClassTestApi.oct.model.Employee;
import com.ClassTestApi.oct.service.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {
    @Autowired
    EmployeeDao employeeDao;

    @GetMapping("/employees")
    List<Employee> getEmployee(){
        return employeeDao.fetchAllEmployee();
    }
    @RequestMapping(value = "/insert",consumes = "application/JSON",method = RequestMethod.POST)
    public void insertStudentRecord(@RequestBody Employee employee){
        employeeDao.insertEmployee(employee);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable int id){
        employeeDao.deleteEmployee(id);
    }
    @PutMapping("/update/{id}")
    public void updateEmployee(@PathVariable int id){
        employeeDao.updateEmployee(id);
    }
}
