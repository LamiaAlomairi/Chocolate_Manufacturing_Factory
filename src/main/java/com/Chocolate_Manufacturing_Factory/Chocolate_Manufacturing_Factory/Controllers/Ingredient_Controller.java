package com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Controllers;

import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Models.Ingredient;
import com.Chocolate_Manufacturing_Factory.Chocolate_Manufacturing_Factory.Services.Ingredient_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "ingredient")
public class Ingredient_Controller {
    //    http://localhost:8080/ingredient/getAll
    @Autowired
    Ingredient_Service ingredient_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Ingredient> getAllIngredients() {

        return ingredient_service.getAllIngredients();
    }
    @GetMapping(value = "getById")
    public Ingredient getIngredientById(@RequestParam Long id) {

        return ingredient_service.getIngredientById(id);
    }
}
