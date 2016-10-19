package com.lirenkj.pattern.mediator;

/**
 * User
 * <p>
 * Created by Alexander on 2016/10/19.
 */
public class User {
    private String mName;

    public User(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
