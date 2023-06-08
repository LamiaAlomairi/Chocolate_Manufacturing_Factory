package com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Repositories;

import com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
