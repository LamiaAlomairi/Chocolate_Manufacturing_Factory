package com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Controllers;

import com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Models.Factory;
import com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Services.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "factory")
public class FactoryController {
    //    http://localhost:8080/factory/getAll
    @Autowired
    FactoryService factoryService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Factory> getAllFactories() {

        return factoryService.getAllFactories();
    }
    @GetMapping(value = "getById")
    public Factory getFactoryById(@RequestParam Long id) {

        return factoryService.getFactoryById(id);
    }
}
