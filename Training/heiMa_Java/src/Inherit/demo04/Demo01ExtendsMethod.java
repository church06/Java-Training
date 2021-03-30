package Inherit.demo04;

/*
* 在父类的继承管当中，创建子类对象，访问成员方法的规则：
*   创建的对象是谁，则优先用谁，没有则向上找
*
* 注意事项：
* 无论是成员方法还是成员变量，如果没有都是向上找，不会向下找子类
*
* 重写(Override)
* 概念：在继承关系中，方法名称一样，参数列表也一样
*
* 重写(Override)：方法名称相同，参数列表也一样。又称覆写
* 重载(Overload)：方法名称相同，参数列表不一样。
*
* 方法覆写特点：创建的是子类对象，则优先使用子类方法
* */

public class Demo01ExtendsMethod {

    public static void main(String[] args) {
        Zi zi = new Zi();

        zi.methodFu();
        zi.methodZi();

        // 创建的是new子类对象，所以优先用子类对象
        zi.method();
    }
}
