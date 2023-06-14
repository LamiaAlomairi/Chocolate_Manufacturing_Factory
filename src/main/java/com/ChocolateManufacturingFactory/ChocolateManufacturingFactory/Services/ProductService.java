package com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Services;

import com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Models.Product;
import com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Repositories.ProductRepository;
import com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.RequestObject.ProductRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    /******  User creating chocolate products  ******/
    public void createProduct(ProductRequest productRequest) {
        Product product = ProductRequest.convert(productRequest);
        productRepository.save(product);
    }

    /******  Get all chocolate products  ******/
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    /******  Get chocolate product by id  ******/
    public Product getProductById(Long id) {
        return productRepository.getProductById(id);
    }
}
