package com.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmbedableClass {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        int id;
        String name;
        EmbedableDemo embedableDemo;

    public EmbedableClass() {
    }

    public EmbedableClass(int id, String name, EmbedableDemo embedableDemo) {
        this.id = id;
        this.name = name;
        this.embedableDemo = embedableDemo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EmbedableClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
