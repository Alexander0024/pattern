package com.lirenkj.pattern.frontcontroller;

import com.lirenkj.pattern.frontcontroller.dispatcher.Dispatcher;

/**
 * FrontController
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class FrontController {
    private Dispatcher mDispatcher;

    public FrontController() {
        mDispatcher = new Dispatcher();
    }

    public boolean isAuthenticUser() {
        System.out.println("User is authenticated successfully.");
        return true;
    }

    private void trackRequest(String request){
        System.out.println("Page requested: " + request);
    }

    public void dispatchRequest(String request) {
        trackRequest(request);
        if (isAuthenticUser()) {
            mDispatcher.dispatch(request);
        }
    }
}
