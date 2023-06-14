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
//@Validated
public class ProductController {
    @Autowired
    ProductService productService;

    /******  User creating chocolate products  ******/
    @PostMapping
//    @PreAuthorize("hasRole('USER')")
    public void createProduct(@RequestBody ProductRequest productRequest) {
        productService.createProduct(productRequest);
    }


    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
    @GetMapping(value = "getById")
    public Product getProductById(@RequestParam Long id) {

        return productService.getProductById(id);
    }
}
