package com.lirenkj.pattern.delegate;

/**
 * BusinessDelegateDemo
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class BusinessDelegateDemo {
    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
