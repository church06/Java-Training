package Interface.demo01;

/*
 * 接口就是多个类的公共规范
 * 接口是一种引用数据类型，最重要的内容是其中的抽象方法
 * 定义接口：
 * public interface 接口名称 {
 *      // 内容
 * }
 *
 * 备注：换成关键字interface后，编译仍然是class
 * Java 7 接口包含内容：
 * 1. 常量
 * 2. 抽象方法
 *
 * Java 8 额外包含：
 * 3. 默认方法
 * 4. 静态方法
 *
 * Java 9 额外包含“
 * 5. 私有方法
 *
 * 接口使用步骤：
 * 1. 接口不能直接使用，必须有一个实现类来实现该接口
 * 格式：
 * public class 实现类名称 implement 接口名称 {
 *      // ...
 * }
 * 2. 接口实现类必须覆写(实现)接口中所有抽象方法
 * 实现：去掉abstract关键字，加上方法大括号
 * 3. 创建实现类的对象，进行使用
 *
 * 注意事项：
 * 如果实现类并没有覆写接口中所有抽象方法，那么这个实现类也必须是抽象类
 * */

public class Demo01Interface {
    public static void main(String[] args) {
        // 错误写法，不能直接new接口
//      MyInterfaceAbstract inter = new MyInterfaceAbstract();

        // 创建实现类的对象使用
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        impl.methodAbs1();
        impl.methodAbs2();
        impl.methodAbs3();
        impl.methodAbs4();
    }
}
