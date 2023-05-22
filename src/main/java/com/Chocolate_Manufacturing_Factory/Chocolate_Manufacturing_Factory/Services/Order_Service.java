package com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Services;

import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Models.Order;
import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Repositories.Order_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Order_Service {
    @Autowired
    Order_Repository order_repository;
    public List<Order> getAllOrders() {

        return order_repository.findAll();
    }

    public Order getOrderById(Long id) {

        return order_repository.findById(id).get();
    }
}
