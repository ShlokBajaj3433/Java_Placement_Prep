package com.example.demo.controller;

import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return service.getAllCustomer();
    }

    @PostMapping
    public Customer saveCustomer(@RequestBody Customer customer) {
        return service.saveCustomer(customer);
    }

    @PostMapping("/List")
    public List<Customer> saveCustomerByList(@RequestBody List<Customer> customers) {
        return service.saveAllCustomers(customers);
    }


    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return service.getCustomerByID(id);
    }

    @PutMapping("/{Id}")
    Customer UpdateCustomerById(@PathVariable Long Id , @RequestBody Customer cust){
        return service.UpdateCustomer(Id,cust);
    }


    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable Long id) {
        service.deleteCustomer(id);
        return "Customer with id " + id + " deleted successfully.";
    }

    @GetMapping("/email/{email}")
    public Customer getCustomerByEmail(@PathVariable String email) {
        return service.getCustomerByEmail(email);
    }

    @GetMapping("/city/{city}")
    public List<Customer> getCustomerByCity(@PathVariable String city) {
        return service.getCustomerByCity(city);
    }

    @GetMapping("/age/{age}")
    public List<Customer> getCustomerByAge(@PathVariable int age) {
        return service.getCustomerByAge(age);
    }
}
