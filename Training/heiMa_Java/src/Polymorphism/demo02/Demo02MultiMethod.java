package Polymorphism.demo02;

/*
* 多态代码中，成员方法的访问规则是：
*       看new谁，就优先用谁，没有则向上找
*
* 口诀：编译看左，运行看右
*
* 对比：
* 成员变量：编译看左，运行也看左
* 成员方法：编译看左，运行看右
* */

public class Demo02MultiMethod {

    public static void main(String[] args) {
        Fu obj = new Zi(); // 多态

        obj.method(); // 父子都有，优先子
        obj.methodFu(); // 子类没有向上找

        // 编译看左，左是Fu，Fu中没有methodZi方法，所以编译报错
//      obj.methodZi(); // 错误写法
    }
}
