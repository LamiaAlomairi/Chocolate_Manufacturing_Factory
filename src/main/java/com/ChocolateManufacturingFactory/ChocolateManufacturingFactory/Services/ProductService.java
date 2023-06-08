package com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Services;

import com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Models.Product;
import com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public List<Product> getAllProducts() {

        return productRepository.findAll();
    }

    public Product getProductById(Long id) {

        return productRepository.findById(id).get();
    }
}
