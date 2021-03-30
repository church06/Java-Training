package Inherit.demo09;

/*
* super关键字用来访问父类内容，而this关键字用来访问本类内容，用法有三种：
* 1. 本类成员方法中，访问本类成员变量
* 2. 本类成员方法中，访问本类另一个成员方法
* 3. 本类构造方法中，访问本类另一个个构造方法
* 第3种情况需要注意
* A. this(...)调用也必须是构造方法的第一且唯一的语句
* B. super和this两种构造不能同时使用
* */

public class Zi extends Fu {

    int num = 20;

    public Zi() {
        // super();
        this(123); // 本类无参构造，调用本类有参构造
        // this()
    }

    public Zi(int n) {

    }

    public void showNum() {
        int num = 10;
        System.out.println(num); // 局部变量
        System.out.println(this.num); // 本类中的成员变量
        System.out.println(super.num); // 父类中的成员变量
    }

    public void methodA() {
        System.out.println("AAA");
    }

    public void methodB() {
        this.methodA();
        System.out.println("BBB");
    }
}
