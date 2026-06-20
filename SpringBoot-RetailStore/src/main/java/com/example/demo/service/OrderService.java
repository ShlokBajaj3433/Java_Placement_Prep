package com.example.demo.service;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Orders;
import com.example.demo.entity.Product;
import com.example.demo.repository.CustomerRepo;
import com.example.demo.repository.OrderRepository;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepo;

    @Autowired
    private CustomerRepo custRepo;

    @Autowired
    private ProductRepository prodRepo;

    public Orders palceOrder(Long custId, Long prodId, int qty){
        Customer customer=custRepo.findById(custId).orElse(null);

        if (customer != null){
            Product product = prodRepo.findById(prodId).orElseThrow(()-> new RuntimeException("product Not found"));
            Orders order = new Orders();
            order.setCustomer(customer);
            order.setProduct(product);
            order.setQuantityOrdered(qty);
            order.setTotalPrice(product.getPrice() * qty);
            product.setQuantity(product.getQuantity() - qty);
            prodRepo.save(product);
            return orderRepo.save(order);
        }

        else {
            throw new RuntimeException("Insufficient product quantity");
        }

    }

    public List<Orders> getAllOrders() {
        return orderRepo.findAll();
    }

    public Orders getOrderById(Long id) {
        return orderRepo.findById(id).orElse(null);
    }

    public void cancelOrder(Long id) {
        orderRepo.deleteById(id);
    }

    public List<Customer> getCustomersByProductId(Long productId) {
        return orderRepo.findCustomersByProductId(productId);
    }

    public List<Customer> getCustomersByProductName(String productName) {
        return orderRepo.findCustomersByProductName(productName);
    }

    public List<Customer> GetCustomerByOrder(Long productId) {
        return orderRepo.findCustomersByProductId(productId);
    }

    public double getRevenue(){
        return orderRepo.totalRevenue();
    }

    public double getTotalAmount(Long custId){
        return orderRepo.totalAmount(custId);
    }

    public Long countOfOrder(Long custID){
        return orderRepo.countOrder(custID);
    }

}
