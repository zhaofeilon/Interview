package com.xuan.singleton;

/**
 * 双检锁懒汉式（线程安全的）
 *
 */
public class SingleTon3 {
    private SingleTon3 instance;
    private SingleTon3(){}
    public SingleTon3 getInstance(){
        if (instance == null) {
            synchronized (SingleTon3.class) {
                if (instance == null) {
                    instance = new SingleTon3();
                }
            }
        }
        return instance;
    }
}
