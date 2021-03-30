package InnerClass.demo02;
/*
 * 局部内部类，若希望访问所在方法的局部变量，那么这个局部变量必须是【有效final的】
 *
 * 备注：Java 8+开始，只要局部变量事实不变，那么final关键字可以省略
 *
 * 原因：
 * 1. new出来的对象在堆内存中
 * 2. 局部变量跟着方法走，在栈内存中
 * 3. 方法运行之后立刻出栈，局部变量消失。但new出来的对象持续存在于堆当中，直到垃圾回收
 * */

public class MyOuter {
    public void methodOuter() {

        int num = 10; // 所在方法的局部变量

        class MyInner {

            public void methodInner() {
                System.out.println(num);
            }

        }
    }
}
