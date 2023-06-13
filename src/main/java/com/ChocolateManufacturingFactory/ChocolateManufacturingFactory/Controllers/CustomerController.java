package com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Controllers;

import com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Models.Customer;
import com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Customer> getAllUsers() {

        return customerService.getAllCustomers();
    }
    @GetMapping(value = "getById")
    public Customer getUserById(@RequestParam Long id) {

        return customerService.getCustomerById(id);
    }
}
