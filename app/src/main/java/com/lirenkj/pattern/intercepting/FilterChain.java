package com.lirenkj.pattern.intercepting;

import com.lirenkj.pattern.intercepting.entity.Target;
import com.lirenkj.pattern.intercepting.interfaces.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * FilterChain
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class FilterChain {
    private List<Filter> mFilters = new ArrayList<>();
    private Target mTarget;

    public void addFilter(Filter filter) {
        mFilters.add(filter);
    }

    public void setTarget(Target target) {
        mTarget = target;
    }

    public void execute(String request) {
        for (Filter filter : mFilters) {
            filter.execute(request);
        }
        mTarget.execute(request);
    }
}
