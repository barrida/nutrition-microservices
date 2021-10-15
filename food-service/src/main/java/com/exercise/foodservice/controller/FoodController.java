package com.exercise.foodservice.controller;

import com.exercise.foodservice.model.Food;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Suleyman Yildirim
 */
@RestController
@RequestMapping("/food")
public class FoodController {

    @GetMapping("/all")
    public List<Food> getAll(){
        return List.of(
                new Food(45, 24, 120),
                new Food(10, 35, 35),
                new Food(25, 12, 46)
        );
    }
}
