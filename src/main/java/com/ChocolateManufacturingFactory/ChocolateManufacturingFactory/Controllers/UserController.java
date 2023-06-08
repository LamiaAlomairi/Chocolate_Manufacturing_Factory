package com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Controllers;

import com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Models.User;
import com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<User> getAllUsers() {

        return userService.getAllUsers();
    }
    @GetMapping(value = "getById")
    public User getUserById(@RequestParam Long id) {

        return userService.getUserById(id);
    }
}
