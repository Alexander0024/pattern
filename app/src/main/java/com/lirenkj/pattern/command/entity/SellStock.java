package com.lirenkj.pattern.command.entity;

import com.lirenkj.pattern.command.interfaces.Order;

/**
 * SellStock
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class SellStock implements Order {
    private Stock mStock;

    public SellStock(Stock stock) {
        mStock = stock;
    }

    @Override
    public void execute() {
        mStock.sell();
    }
}
