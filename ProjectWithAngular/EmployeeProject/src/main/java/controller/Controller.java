package controller;

import com.Project.EmployeeProject.entity.Employee;
import com.Project.EmployeeProject.services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class Controller{
    @Autowired
    Service service;

    @GetMapping("/user/{id}")
    public Employee getEmployeeDetails(@PathVariable int id)
    {
        return service.fetchParticularUserDetails(id);
    }


    @GetMapping("/users")
    public HashMap<Integer, String> getEmployeeIdAndName()
    {
        return service.fetchUserIdAndName();
    }


    @GetMapping("/error")
    public String error()
    {
        return "error";
    }
}