package com.xuan.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 正常情况下，运行上面的代码理应输出 2500。但你真正运行了上面的代码之后，你会发现每次输出结果都小于 2500。
 * synchronized 关键字和 volatile 关键字是两个互补的存在，而不是对立的存在！
 * volatile 关键字是线程同步的轻量级实现，所以 volatile性能肯定比synchronized关键字要好 。但是 volatile 关键字只能用于变量而 synchronized 关键字可以修饰方法以及代码块
 * volatile 关键字能保证数据的可见性，但不能保证数据的原子性。synchronized 关键字两者都能保证。volatile关键字主要用于解决变量在多个线程之间的可见性，而 synchronized 关键字解决的是多个线程之间访问资源的同步性。
 * ------
 *
 */
public class volatileSynchronized {
    private static  int n=0;
    private static int m = 0;
    public static void increase() {
        n++;
    }

    public synchronized static void increase2(){
        m++;
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService threadPool1 = Executors.newFixedThreadPool(5);
        ExecutorService threadPool2 = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            threadPool1.execute(()->{
                for (int j = 0; j < 500; j++) {
                    increase();
                }
            });
        }
        for (int i = 0; i < 5; i++) {
            threadPool2.execute(()->{
                for (int j = 0; j < 500; j++) {
                    increase2();
                }
            });
        }


        Thread.sleep(120);
        System.out.println(n);
        System.out.println(m);

    }
}
