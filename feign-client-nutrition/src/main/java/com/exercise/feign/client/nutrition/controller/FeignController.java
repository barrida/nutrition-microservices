package com.exercise.feign.client.nutrition.controller;

import com.exercise.feign.client.nutrition.model.Food;
import com.exercise.feign.client.nutrition.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

/**
 * @author Suleyman Yildirim
 */
@RestController
@RequestMapping("/food")
public class FeignController {

    @Autowired
    private FeignService feignService;

    @RequestMapping(value="/all",method = RequestMethod.GET)
    public ResponseEntity<List<Food>> getFood(){
        List<Food> food = null;
        try {
          food =  feignService.getFoods();
        } catch (Exception e){
            System.out.println(e);
        }
        return ResponseEntity.ok(food);
    }
}
