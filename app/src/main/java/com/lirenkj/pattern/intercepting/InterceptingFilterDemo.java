package com.lirenkj.pattern.intercepting;

import com.lirenkj.pattern.intercepting.entity.AuthenticationFilter;
import com.lirenkj.pattern.intercepting.entity.DebugFilter;
import com.lirenkj.pattern.intercepting.entity.Target;

/**
 * InterceptingFilterDemo
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class InterceptingFilterDemo {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}
