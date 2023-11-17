package com.orm.java_orm.entities;

import jakarta.persistence.*;

import java.util.List;

@Table(name = "employees")
@Entity
public class Employee {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "phone")
    private String phone;

    @ManyToOne
    @JoinColumn(name="customer_relation")
    private Customer customer_relation;

    @OneToMany(mappedBy = "manager_id")
    private List<Location> locations;
}
