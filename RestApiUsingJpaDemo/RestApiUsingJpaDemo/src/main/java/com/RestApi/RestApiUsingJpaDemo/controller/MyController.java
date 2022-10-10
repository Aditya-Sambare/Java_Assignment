package com.RestApi.RestApiUsingJpaDemo.controller;

import com.RestApi.RestApiUsingJpaDemo.model.Student;
import com.RestApi.RestApiUsingJpaDemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    StudentService studentService;
    @GetMapping("/getstudents")
List<Student> getStudents(){
    List<Student> students = studentService.getStudentList();
    return students;
}
}
