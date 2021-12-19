package com.thulani.customer.repository;

import com.thulani.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer, Integer> {
}
