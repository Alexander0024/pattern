package com.lirenkj.pattern.builder;

import com.lirenkj.pattern.builder.entity.ChickenBurger;
import com.lirenkj.pattern.builder.entity.Coke;
import com.lirenkj.pattern.builder.entity.Meal;
import com.lirenkj.pattern.builder.entity.Pepsi;
import com.lirenkj.pattern.builder.entity.VegBurger;

/**
 * MealBuilder
 * <p>
 * Created by Alexander on 2016/10/18.
 */
public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
