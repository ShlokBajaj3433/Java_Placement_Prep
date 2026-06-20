package com.example.demo.repository;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Orders,Long> {
    @Query("""
                 select count(o)
                 from Orders o
                 Where o.customer.customerId=:customerId""")
    Long countOrder(@Param("customerId") Long custID);

    @Query("select coalesce(sum(o.totalPrice), 0) from Orders o where o.customer.customerId = :customerId")
    double totalAmount(@Param("customerId") Long customerId);


    @Query("select coalesce(sum(o.totalPrice), 0) from Orders o")
    double totalRevenue();

    @Query("select distinct o.customer from Orders o where o.product.productId = :productId")
    List<Customer> findCustomersByProductId(@Param("productId") Long productId);

    @Query("select distinct o.customer from Orders o where lower(o.product.productName) = lower(:productName)")
    List<Customer> findCustomersByProductName(@Param("productName") String productName);


}
