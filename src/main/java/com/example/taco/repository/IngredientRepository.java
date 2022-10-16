package com.example.taco.repository;

import com.example.taco.model.Ingredient;

import java.util.Optional;

public interface IngredientRepository {
    Iterable<Ingredient> findAll(); //all ingredient into a collection of ingredient object
    Optional<Ingredient> findById(String id); //single ingredient by id
    Ingredient save(Ingredient ingredient);  //save an ingredient object
}
