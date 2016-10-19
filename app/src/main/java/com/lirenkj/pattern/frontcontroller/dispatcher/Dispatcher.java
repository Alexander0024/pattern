package com.lirenkj.pattern.frontcontroller.dispatcher;

import com.lirenkj.pattern.frontcontroller.view.HomeView;
import com.lirenkj.pattern.frontcontroller.view.StudentView;

/**
 * Dispatcher
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class Dispatcher {
    private StudentView mStudentView;
    private HomeView mHomeView;

    public Dispatcher() {
        mStudentView = new StudentView();
        mHomeView = new HomeView();
    }

    public void dispatch(String request) {
        if (request.equalsIgnoreCase("STUDENT")) {
            mStudentView.show();
        } else {
            mHomeView.show();
        }
    }
}
