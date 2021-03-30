package Polymorphism.demo04;

/*
* 向上转型一定安全，但一旦转型为父类，，那么就无法调用子类原本特有的方法
*
* 【解决方案】
* 用对象向下转型
* */

public class Demo01Main {
    public static void main(String[] args) {
        // 对象向上转型即为：父类引用指向之类对象
        Animal cat = new Cat();
        cat.eat();

      //cat.catchMouse(); // 错误写法

        // 向下转型
        Cat cat_1 = (Cat) cat;
        cat_1.catchMouse();

        // 错误转型
        // 错误写法，编译不报错，运行报错
        // Dog dog = (Dog) cat; // ClassCastException 类转换异常
    }
}
