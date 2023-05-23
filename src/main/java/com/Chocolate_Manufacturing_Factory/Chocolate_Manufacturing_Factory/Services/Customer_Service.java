package com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Services;

import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Models.Customer;
import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Repositories.Customer_Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Customer_Service {
    @Autowired
    Customer_Repository customer_repository;
    public List<Customer> getAllCustomers() {

        return customer_repository.findAll();
    }

    public Customer getCustomerById(Long id) {

        return customer_repository.findById(id).get();
    }
}
