package com.lirenkj.pattern.nullobject;

/**
 * CustomerFactory
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class CustomerFactory {
    public static final String[] mNames = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name) {
        for (int i = 0; i < mNames.length; i++) {
            if (mNames[i].equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
