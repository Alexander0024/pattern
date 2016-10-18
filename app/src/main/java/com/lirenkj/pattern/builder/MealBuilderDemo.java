package com.lirenkj.pattern.builder;

import com.lirenkj.pattern.builder.entity.Meal;

/**
 * MealBuilderDemo
 * <p>
 * Created by Alexander on 2016/10/18.
 */
public class MealBuilderDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total cost = " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("Non Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total cost = " + nonVegMeal.getCost());
    }
}
