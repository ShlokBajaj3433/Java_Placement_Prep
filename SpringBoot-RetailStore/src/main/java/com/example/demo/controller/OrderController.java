package com.example.demo.controller;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Orders;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    OrderService service;

    @PostMapping("/{customerId}/{productId}/{qty}")
    public Orders placeOrder(
            @PathVariable Long customerId,
            @PathVariable Long productId,
            @PathVariable int qty) {

        return service.palceOrder(customerId, productId, qty);
    }

    @GetMapping
    public List<Orders> getAllOrders() {
        return service.getAllOrders();
    }

    @GetMapping("/{id}")
    public Orders getOrderById(@PathVariable Long id) {
        return service.getOrderById(id);
    }

    @DeleteMapping("/{id}")
    public String cancelOrder(@PathVariable Long id) {
        service.cancelOrder(id);
        return "Order with ID " + id + " has been cancelled.";
    }

    @GetMapping("/product/id/{productId}/customers")
    public List<Customer> getCustomersByProductId(@PathVariable Long productId) {
        return service.getCustomersByProductId(productId);
    }

    @GetMapping("/product/name/{productName}/customers")
    public List<Customer> getCustomersByProductName(@PathVariable String productName) {
        return service.getCustomersByProductName(productName);
    }

    @GetMapping("/revenue")
    public double getTotalRevenue() {
        return service.getRevenue();
    }

    @GetMapping("/count/{customerId}")
    public Long getCountOfOrders(@PathVariable Long customerId) {
        return service.countOfOrder(customerId);
    }

    @GetMapping("/totalAmount/{customerId}")
    public Double getTotalAmount(@PathVariable Long customerId) {
        return service.getTotalAmount(customerId);
    }


}
