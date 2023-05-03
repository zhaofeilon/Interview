package com.xuan.features.polymorphism;


public class DemoTests {
    public static void main(String[] args) {
        //一般老实人的写法
        Cat cat_ = new Cat();
        cat_.eat();//结果为：吃鱼
        cat_.sleep();//结果为:猫会睡懒觉。
        cat_.work();//结果为：动物可以帮助人类干活！ 此处是 子类继承了父类的方法


        //==============================================
        Animal cat=new Cat();//多态的引用，即向上转型（ 注意：向上转型一定是安全的。缺点：一旦向上转型，子类中原本特有的方法就不能再被调用了。	）
        cat.eat();//结果为：吃鱼。当使用多态方式调用方法时，首先检查父类中是否有该方法，如果没有，则编译错误；如果有，再去调用子类的同名方法。
        cat.work();//结果为：动物可以帮助人类干活！ Cat没有定义work方法，此处调的是父类的同名方法
//        cat.sleep();//编译报错。 表明：当我们当子类的对象作为父类的引用使用时，只能访问子类中和父类中都有的方法，而无法去访问子类中特有的方法

        Animal dog=new Dog();
        dog.eat();//结果为：吃骨头。此处调用子类的同名方法。

        //===============================================

        //总结!!!：
        //当使用多态方式调用方法时，首先检查父类中是否有该方法：如果没有，则编译错误；
        //                                            如果有，再去检查子类中是否有该方法：如果有，则调用子类的同名方法；
        //                                                                         如果没有，会去调父类的同名方法。

        //===============================================
        //如果想要调用父类中没有的方法，则要向下转型，这个非常像"强转"
        Cat cat222 = (Cat)cat;        // 向下转型（注意，如果是(Cat)dog 则会报错）
        cat222.sleep();        //结果为:猫会睡懒觉。 可以调用 Cat 的 sleep()
    }
}
class Animal {
    public void eat(){
        System.out.println("动物吃饭！");
    }
    public void work(){
        System.out.println("动物可以帮助人类干活！");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("吃鱼");
    }
    public void sleep() {
        System.out.println("猫会睡懒觉");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("吃骨头");
    }
}

