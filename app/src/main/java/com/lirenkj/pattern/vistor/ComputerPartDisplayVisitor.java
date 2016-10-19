package com.lirenkj.pattern.vistor;

import com.lirenkj.pattern.vistor.entity.Computer;
import com.lirenkj.pattern.vistor.entity.Keyboard;
import com.lirenkj.pattern.vistor.entity.Monitor;
import com.lirenkj.pattern.vistor.entity.Mouse;
import com.lirenkj.pattern.vistor.interactors.ComputerPartVisitor;

/**
 * ComputerPartDisplayVisitor
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Computer");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Mouse");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Keyboard");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Monitor");
    }
}
