package com.exercise.feign.client.nutrition.client;

import com.exercise.feign.client.nutrition.model.Food;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author Suleyman Yildirim
 */
@FeignClient("food-service")
public interface NutritionFeignClient {
    @RequestMapping(method = RequestMethod.GET, value = "/food/all")
    List<Food> getFoods();

//    @RequestMapping(method = RequestMethod.GET,
//            value = "/foods/{foodId}", consumes = "application/json")
//    Food getFood(@PathVariable("foodId") Long foodId);
//
//    @RequestMapping(method = RequestMethod.POST, value = "/foods/{foodId}", consumes = "application/json")
//    Food update(@PathVariable("foodId") Long foodId, Food food);

}
