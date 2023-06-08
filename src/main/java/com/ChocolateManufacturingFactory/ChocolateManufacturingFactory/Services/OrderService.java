package com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Services;

import com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Models.Order;
import com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;
    public List<Order> getAllOrders() {

        return orderRepository.findAll();
    }

    public Order getOrderById(Long id) {

        return orderRepository.findById(id).get();
    }
}
