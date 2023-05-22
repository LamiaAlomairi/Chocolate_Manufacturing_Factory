package com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Services;

import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Models.Supplier;
import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Repositories.Supplier_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Supplier_Service {
    @Autowired
    Supplier_Repository supplier_repository;
    public List<Supplier> getAllSuppliers() {

        return supplier_repository.findAll();
    }

    public Supplier getSupplierById(Long id) {

        return supplier_repository.findById(id).get();
    }
}
