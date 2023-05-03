package com.xuan.reflect;

public class GetClass3 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("com.xuan.features.encapsulation.People");
        System.out.println(aClass);
    }
}
