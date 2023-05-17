package com.xuan.string;

import static java.lang.Thread.sleep;

public class StringBuffer01 implements Runnable{
    static StringBuffer str = new StringBuffer("hello world");
//    static StringBuilder str = new StringBuilder("hello world");

    @Override
    public void run() {
        str = str.append("test01");
        System.out.println(str);
        try {
            sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        str = str.append("test02");
        System.out.println(str);
    }

    public static void main(String[] args) {
        System.out.println(str);
        StringBuffer01 instance = new StringBuffer01();
        new Thread(instance).start();
        new Thread(instance).start();
    }
}
