package com.xuan.features.encapsulation;

/**
 * 三大特性之封装
 * 把客观事物封装成抽象的类，并且类可以把自己的数据和方法只让可信的类或者对象操作，对不可信的进行信息隐藏。封装是面向对象的特征之一，是对象和类概念的主要特性
 *
 * 将对象中的成员变量进行私有化，外部程序是无法访问的。对外提供了访问的方式，就是set和get方法。
 * 而对于这样一个实体对象，外部程序只有赋值和获取值的权限，是无法对内部进行修改
 */
public class People {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
