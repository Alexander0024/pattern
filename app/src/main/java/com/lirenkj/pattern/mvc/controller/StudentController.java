package com.lirenkj.pattern.mvc.controller;

import com.lirenkj.pattern.mvc.model.Student;
import com.lirenkj.pattern.mvc.view.StudentView;

/**
 * StudentController
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class StudentController {
    private Student mModel;
    private StudentView mView;

    public StudentController(Student model, StudentView view) {
        mModel = model;
        mView = view;
    }

    public void setStudentID(String id) {
        mModel.setID(id);
    }

    public String getStudentID() {
        return mModel.getID();
    }

    public void setStudentName(String name) {
        mModel.setName(name);
    }

    public String getStudentName() {
        return mModel.getName();
    }

    public void updateView() {
        mView.printStudentDetails(mModel.getID(), mModel.getName());
    }
}
