package com.lirenkj.pattern.iterator;

import com.lirenkj.pattern.iterator.entity.NameRepository;
import com.lirenkj.pattern.iterator.interfaces.Iterator;

/**
 * NameIteratorDemo
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class NameIteratorDemo {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iterator = nameRepository.getIterator(); iterator.hasNext(); ) {
            System.out.println("Name = " + iterator.next());
        }
    }
}
