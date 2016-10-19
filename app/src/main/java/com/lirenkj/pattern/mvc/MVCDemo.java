package com.lirenkj.pattern.mvc;

import com.lirenkj.pattern.mvc.controller.StudentController;
import com.lirenkj.pattern.mvc.model.Student;
import com.lirenkj.pattern.mvc.view.StudentView;

/**
 * MVCDemo
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class MVCDemo {
    public static void main(String[] args) {
        // 获取学生记录
        Student student = retriveStudentFromDatabase();

        // 创建视图，用于信息输出
        StudentView studentView = new StudentView();

        StudentController controller = new StudentController(student, studentView);

        controller.updateView();

        controller.setStudentName("Alexander");

        controller.updateView();
    }

    private static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setID("10");
        student.setName("Alex");
        return student;
    }
}
