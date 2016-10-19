package com.lirenkj.pattern.delegate;

/**
 * Client
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class Client {
    private BusinessDelegate mBusinessDelegate;

    public Client(BusinessDelegate businessDelegate) {
        mBusinessDelegate = businessDelegate;
    }

    public void doTask() {
        mBusinessDelegate.doTask();
    }
}
