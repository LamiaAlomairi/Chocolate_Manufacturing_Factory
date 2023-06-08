package com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Controllers;

import com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Models.Product;
import com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
@RequestMapping(value = "product")
public class ProductController {
    @Autowired
    ProductService productService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Product> getAllProducts() {

        return productService.getAllProducts();
    }
    @GetMapping(value = "getById")
    public Product getProductById(@RequestParam Long id) {

        return productService.getProductById(id);
    }
}
