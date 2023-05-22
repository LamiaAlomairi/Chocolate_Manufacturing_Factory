package com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Services;

import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Models.Ingredient;
import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Repositories.Ingredient_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Ingredient_Service {
    @Autowired
    Ingredient_Repository ingredient_repository;
    public List<Ingredient> getAllIngredients() {

        return ingredient_repository.findAll();
    }

    public Ingredient getIngredientById(Long id) {

        return ingredient_repository.findById(id).get();
    }
}
