package com.exercise.feign.client.nutrition.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Suleyman Yildirim
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Food {
    private double protein;
    private double carb;
    private double fat;
}

