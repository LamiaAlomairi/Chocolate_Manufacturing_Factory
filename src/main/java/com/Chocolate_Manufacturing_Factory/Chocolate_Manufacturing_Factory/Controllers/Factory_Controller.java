package com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Controllers;

import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Models.Factory;
import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Services.Factory_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "factory")
public class Factory_Controller {
    //    http://localhost:8080/factory/getAll
    @Autowired
    Factory_Service factory_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Factory> getAllFactories() {

        return factory_service.getAllFactories();
    }
    @GetMapping(value = "getById")
    public Factory getFactoryById(@RequestParam Long id) {

        return factory_service.getFactoryById(id);
    }
}
