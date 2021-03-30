package Final.demo01;

/*
 * 当final关键字用来修饰一个类的时候，格式：
 * public final class 类名称{
 *     // ...
 * }
 *
 * 含义：当前类不能有任何子类。(太监类)
 * 注意：一个类如果是final的，那么其中所有成员方法都无法进行覆盖重写
 * */

public final class MyClass {

    public void method() {
        System.out.println("一方通行");
    }

}
