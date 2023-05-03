package com.xuan.reflect;

import com.xuan.features.encapsulation.People;

/**
 * 调用某个类的 class 属性来获取该类对应的 Class 对象
 */
public class GetClass2 {
    public static void main(String[] args) {
        Class<People> peopleClass = People.class;
        System.out.println(peopleClass);
    }
}
