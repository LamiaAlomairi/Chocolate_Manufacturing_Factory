package com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Services;

import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Models.Inventory;
import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Repositories.Inventory_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Inventory_Service {
    @Autowired
    Inventory_Repository inventory_repository;
    public List<Inventory> getAllInventories() {

        return inventory_repository.findAll();
    }

    public Inventory getInventoryById(Long id) {

        return inventory_repository.findById(id).get();
    }
}
