package com.xuan.reflect;

import com.xuan.features.encapsulation.People;

/**
 * 调用某个对象的 getClass()方法
 */
public class GetClass1 {

    public static void main(String[] args) {
        People people = new People();
        Class<? extends People> aClass = people.getClass();
        System.out.println(aClass);
    }

}
