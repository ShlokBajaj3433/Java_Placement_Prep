package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Order {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long orderid;
        private int quantity;
        private double totalprice;

        @ManyToOne
        private Customer customer;
}
