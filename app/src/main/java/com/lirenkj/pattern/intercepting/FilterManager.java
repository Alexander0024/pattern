package com.lirenkj.pattern.intercepting;

import com.lirenkj.pattern.intercepting.entity.Target;
import com.lirenkj.pattern.intercepting.interfaces.Filter;

/**
 * FilterManager
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class FilterManager {
    FilterChain mFilterChain;

    public FilterManager(Target target) {
        mFilterChain = new FilterChain();
        mFilterChain.setTarget(target);
    }

    public void setFilter(Filter filter) {
        mFilterChain.addFilter(filter);
    }

    public void filterRequest(String request) {
        mFilterChain.execute(request);
    }
}
