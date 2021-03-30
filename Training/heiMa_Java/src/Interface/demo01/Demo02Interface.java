package Interface.demo01;

/*
* 1. 接口默认方法可以通过接口实现类对向直接调用
* 2. 接口默认方法也可以被接口实现类进行覆写
* */

public class Demo02Interface {

    public static void main(String[] args) {
        // 创建实现类对象
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs(); // 调用抽象方法，实习及运行是右侧实现类

        // 调用默认方法，如果实现类当中没有，向上找接口的
        a.methodDefault();
        System.out.println("=============");

        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs();
        b.methodDefault(); // 实际类接口B覆写了接口的默认方法
    }
}
