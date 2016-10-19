package com.lirenkj.pattern.command;

import com.lirenkj.pattern.command.interfaces.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * Broker
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class Broker {
    private List<Order> mOrderList = new ArrayList<>();

    public void takeOrder(Order order) {
        mOrderList.add(order);
    }

    public void placeOrders() {
        for (Order order : mOrderList) {
            order.execute();
        }
        mOrderList.clear();
    }
}
