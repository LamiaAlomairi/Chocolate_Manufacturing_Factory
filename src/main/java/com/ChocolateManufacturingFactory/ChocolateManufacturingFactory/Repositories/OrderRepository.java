package com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Repositories;

import com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
