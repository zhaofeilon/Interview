package com.xuan.concurrency;

/**
 *
 */
public class Singleton {
    static volatile Singleton uniqueInstance;

    private Singleton(){}
    public Singleton getUniqueInstance(){
        if (uniqueInstance == null){
            //先判断对象是否已经实例过，没有实例化过才进入加锁代码
            synchronized (Singleton.class){
                if (uniqueInstance == null){
                    return new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
