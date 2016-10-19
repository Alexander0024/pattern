package com.lirenkj.pattern.nullobject;

/**
 * NullCustomer
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return "No available in customer database.";
    }
}
