package com.example.springbootjpaexample.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;


    /**
     *
     * The user class represents a user in the database.
     * The @Entity annotation is used to indicate that this class is a JPA entity.
     * The @Id annotation is used to indicate that this field is the primary key of the entity.
     * The @GeneratedValue annotation is used to specify the generation strategy for the primary key.
     * **/
}
