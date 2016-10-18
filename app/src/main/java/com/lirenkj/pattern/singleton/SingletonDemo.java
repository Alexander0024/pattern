package com.lirenkj.pattern.singleton;

/**
 * SingletonDemo
 * <p>
 * Created by Alexander on 2016/10/18.
 */
public class SingletonDemo {
    public static void main(String[] args) {
        /**
         * 默认情况下，建议使用饿汉式
         */
        HungrySingleton.getInstance();

        /**
         * 明确需要lazy loading的时候使用登记式
         */
        StaticHolderSingleton.getInstance();

        /**
         * 涉及到反序列化创建对象时，使用枚举
         */
        EnumSingleton.INSTANCE.whateverMethod();

        /**
         * 其他特殊需求时，使用双检索
         */
        DoubleCheckLocking.getSingleton();
    }
}
