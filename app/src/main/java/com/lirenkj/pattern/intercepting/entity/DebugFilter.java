package com.lirenkj.pattern.intercepting.entity;

import com.lirenkj.pattern.intercepting.interfaces.Filter;

/**
 * DebugFilter
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class DebugFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
