package com.aditya.pipEvaluationRound2.entities;

import lombok.Data;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Orders {
    @Id
    private int orderId;
    @ManyToOne
    private Tables table;
    @OneToMany
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Menu> menuList;
    @OneToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Bill bill;

}
