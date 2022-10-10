package com.RestApi.RestApiUsingJpaDemo.service;

import com.RestApi.RestApiUsingJpaDemo.model.Student;
import com.RestApi.RestApiUsingJpaDemo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;
    public List<Student> getStudentList (){
        List<Student> list =  new ArrayList<>();
        Iterable<Student> students= studentRepo.findAll();
        students.forEach((student -> list.add(student)));
        return list;
    }
}
