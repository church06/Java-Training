package Inherit.demo08;

/*
* super关键字的三种用法：
* 1. 子类成员方法中，访问父类成员变量
* 2. 子类成员方法中，访问父类成员方法
* 3. 子类构造方法中，访问父类构造方法
* */

public class Zi extends Fu {

    int num = 20;

    public Zi() {
        super();
    }

    public void methodZi() {
        System.out.println(super.num);
    }

    public void method() {
        super.method();
        System.out.println("子类方法");
    }
}
