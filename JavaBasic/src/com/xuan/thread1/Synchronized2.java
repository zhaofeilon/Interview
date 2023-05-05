package com.xuan.thread1;

/**
 * synchronized 修饰静态方法,，作用于当前类对象加锁，进入同步代码前要获得当前类对象的锁
 */
public class Synchronized2 implements Runnable{
    static int n = 0;

    public static synchronized void add() {
        n++;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            add();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Synchronized2());
        Thread t2 = new Thread(new Synchronized2());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(n);
    }

}
