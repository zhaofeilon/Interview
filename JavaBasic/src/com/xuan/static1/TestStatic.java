package com.xuan.static1;

public class TestStatic {
    public static void main(String[] args) {
        // 可以直接调用a
        System.out.println("静态变量a：" + Static01.a);
        System.out.println("实例变量b：" + new Static01().b);
//      静态方法可以直接调用
        Static01.test1();
        new Static01().test2();
    }
}
