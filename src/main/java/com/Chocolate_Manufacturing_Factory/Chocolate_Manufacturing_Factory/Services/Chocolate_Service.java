package com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Services;

import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Models.Chocolate;
import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Repositories.Chocolate_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class Chocolate_Service {
    @Autowired
    Chocolate_Repository chocolate_repository;
    public List<Chocolate> getAllChocolates() {

        return chocolate_repository.findAll();
    }

    public Chocolate getChocolateById(Long id) {

        return chocolate_repository.findById(id).get();
    }
}
