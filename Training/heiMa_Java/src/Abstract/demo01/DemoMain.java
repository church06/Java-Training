package Abstract.demo01;

/*
 * 抽象类方法，就是加上abstract关键字，然后去掉大括号，直接分号结束
 * 抽象类：抽象方法所在类必须是抽象类。class之前写abstract即可
 *
 * 如何使用抽象类和抽象方法：
 * 1. 不能直接创建new抽象类对象
 * 2. 必须用子类继承抽象父类
 * 3. 子类必须覆写抽象类当中所有抽象方法
 * 覆写(实现)：子类去掉抽象方法的abstract关键字，然后补上方法体大括号
 * 4. 创建子类对象进行使用
 * */

public class DemoMain {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.eat();
    }
}
