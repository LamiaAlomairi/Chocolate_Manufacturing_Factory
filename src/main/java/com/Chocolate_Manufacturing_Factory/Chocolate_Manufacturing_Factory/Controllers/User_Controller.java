package com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Controllers;

import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Models.Supplier;
import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Models.User;
import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Services.Supplier_Service;
import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Services.User_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "user")
public class User_Controller {
    //    http://localhost:8080/user/getAll
    @Autowired
    User_Service user_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<User> getAllUsers() {

        return user_service.getAllUsers();
    }
    @GetMapping(value = "getById")
    public User getUserById(@RequestParam Long id) {

        return user_service.getUserById(id);
    }
}
