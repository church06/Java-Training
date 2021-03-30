package OOP_Object_Oriented_Programming.demo01;

/*
 * 定义一个类，用来模拟”学生“事物。其中有两个组成部分：
 * 属性（是什么）：
 *   姓名
 *   年龄
 * 行为（能做什么）：
 *   吃饭
 *   睡觉
 *   学习
 *
 * 对应到Java中：
 *
 * 成员变量（属性）：
 *   String name; 姓名
 *   int age; 年龄
 *
 * 成员方法（行为）：
 *   public void eat() {} 吃饭
 *   public void sleep {} 睡觉
 *   public void study() {} 学习
 * */
public class Student {
    String name; // 姓名
    int age; // 年龄

    /*
    * 注意事项：
    * 1. 成员变量直接定义在类中，在方法外
    * 2. 成员方法不要写static关键字
    * */

    //成员变量
    public void eat () {
        System.out.println("恰饭！");
    }
    public void sleep() {
        System.out.println("打鼾！");
    }
    public void study() {
        System.out.println("学习！");
    }

}
