package Final.demo01;

/*
* 对于成员变量，有final关键字修饰，那么这个变量照样不可变
*
* 1. 由于成员变量具有默认值，所欲用了final之后必须手动赋值，不会给默认值
* 2. 由于final成员变量，那么使用直接赋值，要么通过构造方法赋值，二者选其一
* 3. 必须保证类当中所有重载的构造方法，都最终会对final的成员变量进行赋值
* */

public class Person {

    private final String name;

    public Person() {
        name = "123";
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public Person(String name) {
        this.name = name;
    }
}
