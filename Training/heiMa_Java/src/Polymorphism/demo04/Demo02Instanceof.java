package Polymorphism.demo04;

/*
* 如何知道父类对象的原子类
* 格式：对象 instanceof 类型
*      得到boolean结构，判断钱买你的对象能不能当作后面的实例
* */

public class Demo02Instanceof {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();

        // 用子类特有方法需要向下转型
        // 判断父类引用animal本来是不是Dog
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }

        // 判断animal原来是不是cat
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }

        giveMeAPet(new Dog());
    }

    public static void giveMeAPet(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }

        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }
}
