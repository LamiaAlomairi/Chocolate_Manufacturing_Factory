package com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Services;

import com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Repositories.UserRepository;
import com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Models.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {
    @Autowired
    UserRepository userRepository;
    public List<User> getAllUsers() {

        return userRepository.findAll();
    }

    public User getUserById(Long id) {

        return userRepository.findById(id).get();
    }
}
