package com.lirenkj.pattern.delegate;

import com.lirenkj.pattern.delegate.interfaces.BusinessService;

/**
 * BusinessDelegate
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class BusinessDelegate {
    private BusinessLookUp mLookUp = new BusinessLookUp();

    private BusinessService mBusinessService;

    private String mServiceType;

    public void setServiceType(String serviceType) {
        mServiceType = serviceType;
    }

    public void doTask() {
        mBusinessService = mLookUp.getBusinessService(mServiceType);
        mBusinessService.doProcessing();
    }
}
