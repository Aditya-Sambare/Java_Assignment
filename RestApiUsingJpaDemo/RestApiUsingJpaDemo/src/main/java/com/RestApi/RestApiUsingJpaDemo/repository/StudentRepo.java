package com.RestApi.RestApiUsingJpaDemo.repository;

import com.RestApi.RestApiUsingJpaDemo.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends CrudRepository<Student,Integer> {

}
