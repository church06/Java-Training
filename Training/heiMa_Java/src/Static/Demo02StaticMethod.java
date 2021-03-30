package Static;

/*
* 一旦使用static修饰成员方法，那么就成为了静态方法
* 静态方法不属于对象，而是属于类的
*
* 如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用
* 若有static关键字，则不需要创建对象，直接通过类名称使用
*
* 无论是成员变量还是成员方法，若有了static，都推荐使用类名称调用
* 静态变量：类名称 静态变量
* 静态方法：类名称 静态方法()
*
* 注意事项：
* 1. 静态不能直接访问非静态
*原因： 因为在内存当中【先】有静态内容，【后】有非静态内容
* "先人知后人。后人未闻先"
* 2. 静态方法中不能有this
* 原因：this代表当前对象，通过当前对象调用方法。
* */

public class Demo02StaticMethod {

    public static void main(String[] args) {
        MyClass obj = new MyClass(); // 首先创建对象
        // 然后才能使用没有static关键字的内容
        obj.method();

        // 对于静态方法来说，可以通过对象名进行调用，也可以直接通过类名称来调用
        obj.methodStatic(); // 正确，不推荐，这种写法在编译后也会被javac翻译成：类名称 静态方法名
        MyClass.methodStatic(); // 正确，推荐

        // 本类当中的静态方法可以省略名称
        myMethod();
        Demo02StaticMethod.myMethod(); // 完全等效
    }

    public static void myMethod() {
        System.out.println("自己的方法");
    }
}
