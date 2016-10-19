package com.lirenkj.pattern.command.entity;

import com.lirenkj.pattern.command.interfaces.Order;

/**
 * BuyStock
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class BuyStock implements Order {
    private Stock mStock;

    public BuyStock(Stock stock) {
        mStock = stock;
    }

    @Override
    public void execute() {
        mStock.buy();
    }
}
