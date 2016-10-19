package com.lirenkj.pattern.delegate.entity;

import com.lirenkj.pattern.delegate.interfaces.BusinessService;

/**
 * EJBService
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class EJBService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
