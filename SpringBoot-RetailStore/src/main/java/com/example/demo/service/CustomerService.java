package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepo;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo repository;
    public List<Customer> getAllCustomer() {
        return repository.findAll();
    }

    public Customer saveCustomer(Customer customer) {
        return repository.save(customer);
    }

    public List<Customer> saveAllCustomers(List<Customer> customers) {
        return repository.saveAll(customers);
    }

    public Customer UpdateCustomer(Long id, Customer cust) {
        Customer existingCust = repository.findById(id).orElse(null);

        if (existingCust != null) {

            existingCust.setName(cust.getName());
            existingCust.setAge(cust.getAge());
            existingCust.setEmail(cust.getEmail());
            existingCust.setPassword(cust.getPassword());
            existingCust.setBankUserName(cust.getBankUserName());
            existingCust.setCity(cust.getCity());

            return repository.save(existingCust);
        }
        return null;
    }


    public void deleteCustomer(Long id) {
        repository.deleteById(id);
    }


    public Customer getCustomerByID(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Customer getCustomerByEmail(String email) {
        return repository.findByEmail(email).orElse(null);
    }

    public List<Customer> getCustomerByCity(String city) {
        return repository.findByCity(city);
    }

    public List<Customer> getCustomerByAge(int age) {
        return repository.findByAgeGreaterThan(age);
    }
}
