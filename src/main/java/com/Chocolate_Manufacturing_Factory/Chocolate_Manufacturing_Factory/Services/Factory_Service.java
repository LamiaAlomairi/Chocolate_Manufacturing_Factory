package com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Services;

import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Models.Factory;
import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Repositories.Factory_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Factory_Service {
    @Autowired
    Factory_Repository factory_repository;
    public List<Factory> getAllFactories() {

        return factory_repository.findAll();
    }

    public Factory getFactoryById(Long id) {

        return factory_repository.findById(id).get();
    }
}
