package com.lirenkj.pattern.nullobject;

/**
 * RealCustomer
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class RealCustomer extends AbstractCustomer {
    public RealCustomer(String name) {
        this.mName = name;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getName() {
        return mName;
    }
}
