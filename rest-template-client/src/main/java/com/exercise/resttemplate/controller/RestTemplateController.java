package com.exercise.resttemplate.controller;

import com.exercise.resttemplate.client.NutritionRestTemplateClient;
import com.exercise.resttemplate.model.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Suleyman Yildirim
 */
@RestController
@RequestMapping("/food")
public class RestTemplateController {

    @Autowired
    NutritionRestTemplateClient nutritionRestTemplateClient;

    @GetMapping(value = "/all")
    public ResponseEntity<List<Food>> getFood() {
        List<Food> food = nutritionRestTemplateClient.getFoods();
        return ResponseEntity.ok(food);
    }
}
