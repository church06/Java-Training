package InnerClass.demo01;

/*
 * 如果一个事物内部包含另一个事物，则是一个类内部包含另一个类
 * 如：身体和心脏的关系，汽车和发动机的关系
 *
 * 分类：
 * 1. 成员内部类
 * 2. 局部内部类(包含匿名内部类)
 *
 * 成员内部类定义格式：
 * 修饰符 class 外部类名称 {
 *    修饰符 class 内部类名称 {
 *        // ...
 *    }
 *    // ...
 * }
 *
 * 注意：内用外，随意访问；外用内，需要内部类对象
 *
 * ==============================================
 * 如何使用成员内部类
 * 1. 间接：在外部类的方法中，使用内部类，然后main只是调用外部类方法
 * 2. 直接：公式：类名称 对象名 = new 类名称();
 *            【外部类名称名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();】
 * */

public class Demo01InnerClass {

    public static void main(String[] args) {
        Body body = new Body();
        // 通过外部类的对象，调用外部类的方法，里面间接使用内部类Heart
        body.methodBody();
        System.out.println("==========================");

        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }

}
