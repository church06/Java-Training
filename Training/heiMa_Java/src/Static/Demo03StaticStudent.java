package Static;

/*
* 根据类名称访问静态成员变量的时候， 全程和对象没关系，只和类有关系
* */

public class Demo03StaticStudent {

    public static void main(String[] args) {
        // 首先设置教室，静态应通过类名称调用
        Student.room = "101";

        Student one = new Student("1", 20);
        System.out.println("one的姓名：" + one.getName() + "，年龄：" + one.getAge() + "，教室：" + Student.room);
        System.out.println("================");

        Student two = new Student("2", 21);
        System.out.println("two的姓名：" + two.getName() + "，年龄：" + two.getAge() + "，教室：" + Student.room);

    }
}
