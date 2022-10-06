package com.bean;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Date;

@Entity
public class DiffrentAnnotationsInHibernate {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
@Column (name = "ID")
int id;
@Column(name = "NAME")
String name;
@Transient
String transientMessage;
@Temporal(TemporalType.DATE)
@Column(name = "DATE")
Date date;
@Lob
@Column(name = "Image")
byte[] image;

    public DiffrentAnnotationsInHibernate() {
    }

    public DiffrentAnnotationsInHibernate(int id, String name, String transientMessage, Date date, byte[] image) {
        this.id = id;
        this.name = name;
        this.transientMessage = transientMessage;
        this.date = date;
        this.image = image;
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

    public String getTransientMessage() {
        return transientMessage;
    }

    public void setTransientMessage(String transientMessage) {
        this.transientMessage = transientMessage;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "DiffrentAnnotationsInHibernate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", transientMessage='" + transientMessage + '\'' +
                ", date=" + date +
                ", image=" + Arrays.toString(image) +
                '}';
    }
}
