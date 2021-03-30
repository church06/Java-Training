package OOP_Object_Oriented_Programming.demo04;

public class Person {
    String name;

    // 参数name是对方名字
    // 成员变量name是自己名字
    public void sayHello(String name) {
        System.out.println(name + "，你好，我是：" + this.name);
        System.out.println(this);
    }
}
