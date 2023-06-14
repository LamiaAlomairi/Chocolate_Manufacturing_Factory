package com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Controllers;

import com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Models.Product;
import com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.RequestObject.ProductRequest;
import com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
@RequestMapping(value = "api/products")
public class ProductController {
    @Autowired
    ProductService productService;

    /******  User creating chocolate products  ******/
    @PostMapping
//    @PreAuthorize("hasRole('USER')")
    public void createProduct(@RequestBody ProductRequest productRequest) {
        productService.createProduct(productRequest);
    }

    /******  Get all chocolate products  ******/
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    /******  Get chocolate product by id  ******/
    @GetMapping(value = "{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    /******  Update chocolate product by id  ******/
    @PutMapping("{id}")
//    @PreAuthorize("hasRole('USER')")
    public void updateProduct(@PathVariable long id, @RequestBody @Validated ProductRequest productRequest) {
        productService.updateProduct(id, productRequest);
    }
}
