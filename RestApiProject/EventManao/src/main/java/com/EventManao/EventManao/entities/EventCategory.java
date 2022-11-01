package com.EventManao.EventManao.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class EventCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_category_id")
    int eventCategoryId;
    @Column(name = "event_category_name")
    String eventCategoryName;
}
