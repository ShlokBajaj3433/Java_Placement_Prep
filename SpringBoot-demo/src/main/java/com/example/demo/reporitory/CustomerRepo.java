package com.example.demo.reporitory;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Customer;


public interface CustomerRepo extends JpaRepository<Customer,Long> {
    Optional<Customer> findByEmail(String email);
    List<Customer> findByCity(String city);

    List<Customer> findByAgeGreaterThan(int age);
}
