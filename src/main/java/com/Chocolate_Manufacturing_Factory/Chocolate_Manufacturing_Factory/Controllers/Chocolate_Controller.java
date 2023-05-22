package com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Controllers;

import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Models.Chocolate;
import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Services.Chocolate_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
@RequestMapping(value = "chocolate")
public class Chocolate_Controller {
    //    http://localhost:8080/chocolate/getAll
    @Autowired
    Chocolate_Service chocolate_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Chocolate> getAllChocolates() {

        return chocolate_service.getAllChocolates();
    }
    @GetMapping(value = "getById")
    public Chocolate getChocolateById(@RequestParam Long id) {

        return chocolate_service.getChocolateById(id);
    }
}
