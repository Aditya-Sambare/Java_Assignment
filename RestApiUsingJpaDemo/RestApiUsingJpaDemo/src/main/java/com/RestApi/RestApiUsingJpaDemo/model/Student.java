package com.RestApi.RestApiUsingJpaDemo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Student {
    @Id
    int id;
    String name;
}
