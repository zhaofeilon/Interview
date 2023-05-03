package com.xuan.singleton;

/**
 * 懒汉式（线程不安全的）
 * 懒汉式，顾名思义就是实例在用到的时候才去创建，用的时候才去检查有没有实例，如果有则返回，没有则新建。但是这种会产生线程不安全的情况，会有可能多个线程同时进入if语句判断都没有实例，从而实例化了两个，就不是单例了
 */
public class SingleTon2 {
    private SingleTon2 instance;

    private SingleTon2() {
    }
    public SingleTon2 getInstance(){
        if (instance == null){
            instance = new SingleTon2();
        }
        return instance;
    }
}