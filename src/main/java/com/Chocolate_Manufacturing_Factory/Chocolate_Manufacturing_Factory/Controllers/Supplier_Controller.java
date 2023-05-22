package com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Controllers;

import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Models.Order;
import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Models.Supplier;
import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Services.Order_Service;
import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Services.Supplier_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "supplier")
public class Supplier_Controller {
    //    http://localhost:8080/supplier/getAll
    @Autowired
    Supplier_Service supplier_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Supplier> getAllSuppliers() {

        return supplier_service.getAllSuppliers();
    }
    @GetMapping(value = "getById")
    public Supplier getSupplierById(@RequestParam Long id) {

        return supplier_service.getSupplierById(id);
    }
}
