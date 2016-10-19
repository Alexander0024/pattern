package com.lirenkj.pattern.intercepting.entity;

import com.lirenkj.pattern.intercepting.interfaces.Filter;

/**
 * AuthenticationFilter
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class AuthenticationFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
