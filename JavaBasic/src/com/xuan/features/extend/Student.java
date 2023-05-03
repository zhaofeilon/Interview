package com.xuan.features.extend;

import com.xuan.features.encapsulation.People;

/**
 * 三大特性之继承
 * 就是子类继承父类的特征和行为，使得子类对象（实例）具有父类的实例域和方法，或子类从父类继承方法，使得子类具有父类相同的行为。
 */
public class Student extends People {
    private Long number;

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }
}
