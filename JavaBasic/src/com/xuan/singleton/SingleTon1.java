package com.xuan.singleton;

/**
 * 饿汉试创建单例模型（线程安全）
 *饿汉式，名字就能看出来，很饿，所以实例在初始化的时候就已经建好了。优点是没有线程安全的问题，缺点是浪费内存空间
 */
public class SingleTon1 {
    private static SingleTon1 instance = new SingleTon1();

    private SingleTon1() {
    }

    public SingleTon1 getInstance(){
        return instance;
    }


}
