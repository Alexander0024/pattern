package com.lirenkj.pattern.frontcontroller;

/**
 * FrontControllerDemo
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class FrontControllerDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();

        frontController.dispatchRequest("student");
        frontController.dispatchRequest("home");
    }
}
