package com.exercise.feign.client.nutrition.service;

import com.exercise.feign.client.nutrition.client.NutritionFeignClient;
import com.exercise.feign.client.nutrition.model.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Suleyman Yildirim
 */
@Service
public class FeignService {

    @Autowired
    NutritionFeignClient nutritionFeignClient;

    public List<Food> getFoods(){
         return nutritionFeignClient.getFoods();
    }

}
