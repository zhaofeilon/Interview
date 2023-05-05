package com.xuan.static1;

/**
 * static 详解
 */
public class Static01 {
//    static 修饰的变量为静态变量，可以直接通过类名调用
    static int a =10;
    int b= 10;

    static void test1(){
        System.out.println("这是静态方法");
        a++;
    }
    void test2(){
        System.out.println("这是实例方法");
    }
}
