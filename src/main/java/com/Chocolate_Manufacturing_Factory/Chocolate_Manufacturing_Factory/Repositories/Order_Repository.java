package com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Repositories;

import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Order_Repository extends JpaRepository<Order, Long> {
}
