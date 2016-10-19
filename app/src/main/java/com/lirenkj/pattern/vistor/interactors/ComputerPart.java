package com.lirenkj.pattern.vistor.interactors;

/**
 * ComputerPart
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
