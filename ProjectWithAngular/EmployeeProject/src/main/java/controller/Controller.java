package controller;

import daoClasses.Employee;
import daoClasses.EmployeeIdName;
import daoClasses.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller{
    @Autowired
    Service service;

    @GetMapping("/user/{id}")
    public Employee getEmployeeDetails(@PathVariable int id)
    {
        return service.getParticularEmployeeDetails(id);
    }
    @GetMapping("/users")
    public String getEmployeeIdAndName()
    {
          return "Hello";
    }
    @GetMapping("/error")
    public String error()
    {
        return "error";
    }
}
