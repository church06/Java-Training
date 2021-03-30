package OOP_Object_Oriented_Programming.demo03;

/*
 * 问题描述：定义Person年龄时，无法阻止不合理数值被设置进来
 * 解决方案：用private关键字描述需要保护的成员变量进行修饰
 *
 * 一单使用private进行修饰，name本类当中仍可以随意访问，但，一旦超出本类范围之外，便不再能够直接访问
 *
 * 间接访问：定义一对Getter/Setter方法进行间接访问private成员变量
 * 必须叫setXxx/getXxx是命名规则
 * 对于Getter来说，不能有参数，返回值类型和成员变量对应。
 * 对于Setter来说，不能有返回值，参数类型和成员变量对应。
 * */

public class Person {
    String name;
    private int age;

    public void show() {
        System.out.println("我叫：" + name + "，年龄：" + age);
    }

    // 该成员方法专门用于向age设置数据 - Setter
    public void setAge(int num) {
        if (num < 100 && num >= 9) {
            age = num;
        } else {
            System.out.println("Age Error.");
        }
    }


    // 该成员方法用于获取age设置数据 - Getter
    public int getAge() {
        return age;
    }
}
