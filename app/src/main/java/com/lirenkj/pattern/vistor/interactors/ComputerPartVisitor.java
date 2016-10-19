package com.lirenkj.pattern.vistor.interactors;

import com.lirenkj.pattern.vistor.entity.Computer;
import com.lirenkj.pattern.vistor.entity.Keyboard;
import com.lirenkj.pattern.vistor.entity.Monitor;
import com.lirenkj.pattern.vistor.entity.Mouse;

/**
 * ComputerPartVisitor
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public interface ComputerPartVisitor {
    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);
}
