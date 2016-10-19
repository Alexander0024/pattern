package com.lirenkj.pattern.vistor.entity;

import com.lirenkj.pattern.vistor.interactors.ComputerPart;
import com.lirenkj.pattern.vistor.interactors.ComputerPartVisitor;

/**
 * Mouse
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
