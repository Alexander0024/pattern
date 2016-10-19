package com.lirenkj.pattern.delegate;

import com.lirenkj.pattern.delegate.entity.EJBService;
import com.lirenkj.pattern.delegate.entity.JMSService;
import com.lirenkj.pattern.delegate.interfaces.BusinessService;

/**
 * BusinessLookUp
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType) {
        if (serviceType.equalsIgnoreCase("EJB")) {
            return new EJBService();
        } else {
            return new JMSService();
        }
    }
}
