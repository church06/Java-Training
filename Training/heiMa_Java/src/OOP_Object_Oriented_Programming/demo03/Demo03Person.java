package OOP_Object_Oriented_Programming.demo03;

public class Demo03Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "Jbs";
        //person.age = 1200; // 直接访问private是错误写法
        person.setAge(-20);
        person.show();
    }
}
