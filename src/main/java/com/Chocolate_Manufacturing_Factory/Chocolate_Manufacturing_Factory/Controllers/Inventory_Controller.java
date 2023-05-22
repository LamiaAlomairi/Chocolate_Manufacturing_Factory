package com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Controllers;

import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Models.Inventory;
import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Services.Inventory_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "inventory")
public class Inventory_Controller {
    //    http://localhost:8080/inventory/getAll
    @Autowired
    Inventory_Service inventory_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Inventory> getAllInventories() {

        return inventory_service.getAllInventories();
    }
    @GetMapping(value = "getById")
    public Inventory getInventoryById(@RequestParam Long id) {

        return inventory_service.getInventoryById(id);
    }
}
