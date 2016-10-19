package com.lirenkj.pattern.vistor;

import com.lirenkj.pattern.vistor.entity.Computer;
import com.lirenkj.pattern.vistor.interactors.ComputerPart;

/**
 * ComputerPartDisplayVisitorDemo
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class ComputerPartDisplayVisitorDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
