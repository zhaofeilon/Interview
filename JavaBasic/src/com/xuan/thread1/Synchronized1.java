package com.xuan.thread1;

/**
 * synchronized 关键字 修饰实例方法作用于当前实例加锁，进入同步代码前要获得当前实例的锁
 */
public class Synchronized1 implements Runnable{
    //共享资源
    static int n = 0;

    public synchronized void add(){
      n++;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            add();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // 对一个实例起多个线程
        Synchronized1 obj = new Synchronized1();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
////       创建两个实例，对每个实例起一个的线程
//        Thread t1 = new Thread(new Synchronized1());
//        Thread t2 = new Thread(new Synchronized1());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(n);

    }
}
