package com.orm.java_orm.entities;


import jakarta.persistence.*;

import java.util.List;

@Table(name = "locations")
@Entity
public class Location {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "address")
    private String address;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Employee manager_id;

    @OneToMany(mappedBy = "location")
    private List<Rental> rentals;

}
