package com.lirenkj.pattern.builder.entity;

import com.lirenkj.pattern.builder.interfaces.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Meal
 * <p>
 * Created by Alexander on 2016/10/18.
 */
public class Meal {
    private List<Item> mItems = new ArrayList<>();

    public void addItem(Item item) {
        mItems.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : mItems) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : mItems) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
