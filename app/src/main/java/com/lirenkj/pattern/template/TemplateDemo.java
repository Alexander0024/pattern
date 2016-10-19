package com.lirenkj.pattern.template;

/**
 * TemplateDemo
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class TemplateDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
