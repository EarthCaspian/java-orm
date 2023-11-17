package com.orm.java_orm.entities;


import jakarta.persistence.*;

import java.util.List;

@Table(name = "customers")
@Entity
public class Customer {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "national_id")
    private int national_id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @OneToMany(mappedBy = "customer_relation")
    private List<Employee> employees;

    @OneToMany(mappedBy = "customer")
    private List<Rental> rentals;
}
