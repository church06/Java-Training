package Inherit.demo01;

/*
* 在继承关系中，子类就是一个父类。即子类可以被当做父类看待
* 例如父类是员工，子类是讲师，那么讲师就是一个员工。关系is a
*
* 定义父类格式：（一个普通的类定义）
* public static 父类名称 {
*     // ...
* }
*
* 定义自雷格式：
* public static 子类名称 extends 父类名称 {
*     // ...
* }
* */

public class Demo01Extends {

    public static void main(String[] args) {
        // 创建一个子类对象
        Teacher teacher = new Teacher();
        // Teacher类当中虽然什么都没写，但是会继承来自父类的method方法
        teacher.method();

        // 创建领体罚子类助教对象
        Assistant assistant = new Assistant();
        assistant.method();

    }
}
