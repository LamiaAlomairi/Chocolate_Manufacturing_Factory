package com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Services;

import com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Models.Factory;
import com.ChocolateManufacturingFactory.ChocolateManufacturingFactory.Repositories.FactoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FactoryService {
    @Autowired
    FactoryRepository factoryRepository;
    public List<Factory> getAllFactories() {

        return factoryRepository.findAll();
    }

    public Factory getFactoryById(Long id) {

        return factoryRepository.findById(id).get();
    }
}
