package OOP_Object_Oriented_Programming.demo04;

/*
* 当方噶的局部变量和类的成员变量重名的时候，根据”就近原则“，优先使用局部变量
* 如需要访问本类当中的成员变量，需要使用格式：this.成员变量名
*
* 通过谁调用的方法，谁就是this
* */
public class Demo01Person {
    public static void main(String[] args) {
        Person person = new Person();
        // 设置我自己名字
        person.name = "WJL";
        person.sayHello("WSC");

        System.out.println(person); // 地址值
    }




}
