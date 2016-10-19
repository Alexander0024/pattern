package com.lirenkj.pattern.command;

import com.lirenkj.pattern.command.entity.BuyStock;
import com.lirenkj.pattern.command.entity.SellStock;
import com.lirenkj.pattern.command.entity.Stock;

/**
 * CommandDemo
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class CommandDemo {
    public static void main(String[] args) {
        Stock stock = new Stock();

        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrders();
    }
}
