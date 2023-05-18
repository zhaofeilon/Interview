package com.xuan.collection.compara;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    public static void main(String[] args) {
        Student zhansan = new Student("zhansan", 12);
        Student lisi = new Student("lisi", 23);
        Student wangwu = new Student("wangwu", 17);
        ArrayList<Student> list = new ArrayList<>();
        list.add(zhansan);
        list.add(lisi);
        list.add(wangwu);
        for (Student stu: list
             ) {
            System.out.println(stu.getName()+" "+ stu.getAge());
        }
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        Collections.sort(list,comparator);
        for (Student stu: list
        ) {
            System.out.println(stu.getName()+" "+ stu.getAge());
        }
    }
}
