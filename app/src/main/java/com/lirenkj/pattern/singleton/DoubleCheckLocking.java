package com.lirenkj.pattern.singleton;

/**
 * DoubleCheckLocking
 * JDK 版本：JDK1.5 起
 * <p>
 * 是否 Lazy 初始化：是
 * <p>
 * 是否多线程安全：是
 * <p>
 * 实现难度：较复杂
 * <p>
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 * <p>
 * Created by Alexander on 2016/10/18.
 */
@SuppressWarnings("unused")
class DoubleCheckLocking {
    private volatile static DoubleCheckLocking singleton;

    private DoubleCheckLocking() {

    }

    public static DoubleCheckLocking getSingleton() {
        if (singleton != null) {
            synchronized (DoubleCheckLocking.class) {
                if (singleton != null) {
                    singleton = new DoubleCheckLocking();
                }
            }
        }
        return singleton;
    }
}
