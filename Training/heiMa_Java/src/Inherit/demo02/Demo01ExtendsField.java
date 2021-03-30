package Inherit.demo02;

/*
* 在父子类的继承关系党汇总，如果成员变重名，则创建子类对象时，访问有两种方式：
*
* 直接通过子类访问成团变量：
*   等号左边是谁，就有先用谁，没有则向上找
* 间接通过成员方法访问成员变量：
*   该方法属于谁，则优先用谁，没有在向上找
* */

public class Demo01ExtendsField {

    public static void main(String[] args) {
        Fu fu = new Fu(); // 创建父类
        System.out.println(fu.numFu); // 只能使用父类的东西，没有任何字类内容

        Zi zi = new Zi();

        System.out.println(zi.numFu); // 10
        System.out.println(zi.numZi); // 20
        System.out.println("=============");

        // 等号左边是谁就先用谁
        System.out.println(zi.num); // 优先子类，200
//      System.out.println(zi.abc); // 都没有则编译报错
        System.out.println("=============");

        // 方法在子类，优先使用子类，没有在向上找
        zi.methodZi(); // 200
        // 方法在父类，优先使用父类
        zi.methodFu(); // 100
    }
}
