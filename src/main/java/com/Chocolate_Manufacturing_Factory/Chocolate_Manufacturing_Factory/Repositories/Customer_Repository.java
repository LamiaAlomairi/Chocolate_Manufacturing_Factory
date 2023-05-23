package com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Repositories;

import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Customer_Repository extends JpaRepository<Customer, Long> {
}
