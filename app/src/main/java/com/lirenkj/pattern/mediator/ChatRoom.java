package com.lirenkj.pattern.mediator;

import java.util.Date;

/**
 * ChatRoom
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
