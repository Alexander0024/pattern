package com.lirenkj.pattern.vistor.entity;

import com.lirenkj.pattern.vistor.interactors.ComputerPart;
import com.lirenkj.pattern.vistor.interactors.ComputerPartVisitor;

/**
 * Keyboard
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
