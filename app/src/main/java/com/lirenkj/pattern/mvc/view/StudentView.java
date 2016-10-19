package com.lirenkj.pattern.mvc.view;

/**
 * StudentView
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class StudentView {
    public void printStudentDetails(String id, String name) {
        System.out.println("Student:");
        System.out.println("ID = " + id + " Name = " + name);
    }
}
