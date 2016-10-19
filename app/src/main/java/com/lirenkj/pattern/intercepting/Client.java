package com.lirenkj.pattern.intercepting;

/**
 * Client
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class Client {
    FilterManager mFilterManager;

    public void setFilterManager(FilterManager filterManager) {
        mFilterManager = filterManager;
    }

    public void sendRequest(String request) {
        mFilterManager.filterRequest(request);
    }
}
