package com.EventManao.EventManao.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
@Entity
@Data
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_id", nullable = false,updatable = false)
   int adminId;
    @Column(name = "admin_name", nullable = false,updatable = false)
    String adminName;
    @Column(name = "admin_email", nullable = false,updatable = false)
    String adminEmail;
    @Column(name = "admin_password", nullable = false,updatable = false)
    String adminPassword;
}
