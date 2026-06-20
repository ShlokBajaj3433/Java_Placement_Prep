package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    @Column(nullable = false)
    private String name;
    private String email;
    private String city;
    private int age;

    @Column(nullable = false)
    private String bankUserName;
    @Column(nullable = false)
    private String password;

}
