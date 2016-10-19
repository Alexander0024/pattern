package com.lirenkj.pattern.vistor.entity;

import com.lirenkj.pattern.vistor.interactors.ComputerPart;
import com.lirenkj.pattern.vistor.interactors.ComputerPartVisitor;

/**
 * Computer
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class Computer implements ComputerPart {
    private ComputerPart[] mParts;

    public Computer() {
        mParts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart part : mParts) {
            part.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
