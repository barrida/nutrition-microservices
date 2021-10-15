package com.exercise.resttemplate.client;

import com.exercise.resttemplate.model.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Suleyman Yildirim
 */
@Component
public class NutritionRestTemplateClient {

    @Autowired
    RestTemplate restTemplate;

    public List<Food> getFoods(){
        ResponseEntity<List<Food>> restExchange =
                restTemplate.exchange(
                        "http://food-service/food/all",
                        HttpMethod.GET,
                        null,
                        new ParameterizedTypeReference<List<Food>>() {
                        });

        return restExchange.getBody();
    }
}