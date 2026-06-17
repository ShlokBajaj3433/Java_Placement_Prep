package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.reporitory.CustomerRepo;

import jakarta.persistence.Id;

@Service
public class CustomerService {
    // customer type data
    @Autowired
    private CustomerRepo reporitory;
    
    public List<Customer> getAllCustomer(){
        return reporitory.findAll();
    }

    public Customer SaveCustomer(Customer customer){
        return reporitory.save(customer);
    }

    public Customer getCustomerByID(Long Id){
        return reporitory.findById(Id).orElse(null);

    }

    public Customer getCustomerByEmail(String email){
        return reporitory.findByEmail(email).orElse(null);

    }

    public List<Customer>getCustomerByCity(String city){
        return reporitory.findByCity(city);
    }

    public List<Customer>getCustomerByAge(int age){
        return reporitory.findByAgeGreaterThan(age);
    }



}
