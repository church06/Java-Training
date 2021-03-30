package OOP_Object_Oriented_Programming.demo01;

public class Demo02Student {
    /*
    * 通常情况下，一个类不能直接使用，需要根据类创建一个对象才能使用
    *
    * 1. 导包：只出需要使用的类的所在位置
    * import 包名称.类名称;
    * import cn.itcast.day06.demo01.Student;
    * 对于和当前类属于同一个包的情况下，可以省略导包语句不写
    *
    * 2. 创建，格式：
    * 类名称 对象名 = new 类名();
    * Student stu = new Student();
    *
    * 3. 使用，分为两种情况：
    * 使用成员变量：对象名.成员变量名
    * 使用成员方法：对象名成员方法名(参数)
    * (想用谁，用对象名.谁)
    *
    * 注意事项：
    * 如果成员变量没有进行复制，那么会有一个默认值，规则和数组一样
    * */
    public static void main(String[] args) {
        // 1. 导包:
        // 需要使用Student类，和自己在同一个包下，省略不写

        // 2. 创建，格式：
        // 类名称 对象名 = new 类名称();
        // 根据student类，创建一个名为stu的对象
        Student stu = new Student();

        // 3. 使用其中的成员变量，格式：
        //对象名.成员变量名
        System.out.println(stu.name); // null
        System.out.println(stu.age); // 0
        System.out.println("=================");

        // 改变对象当中的成员变量述职内容
        // 将右侧字符串，赋值交给stu对象当中的name成员变量
        stu.name = "11111";
        stu.age = 18;
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("=================");

        // 使用对象的成员方法，格式：
        // 对象名.成员方法名()
        stu.eat();
        stu.sleep();
        stu.study();
    }
}
