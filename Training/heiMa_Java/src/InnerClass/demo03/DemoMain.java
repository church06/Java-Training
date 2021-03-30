package InnerClass.demo03;

/*
* 如果接口的实现类(或是父类的子类)，只需要使用唯一的一次。
* 那么这种情况下就可以省略该类的定义，而改为使用【匿名内部类】。
*
* 匿名内部类的定义格式：
* 接口名称 对象名 = new 接口名称() {
*     // 覆盖重写所有抽象方法
* };
*
* 对格式 "new 接口名称() {...}" 进行解析：
* 1. new:     创建对象的动作
* 2. 接口名称: 匿名内部类需要实现的哪个接口
* 3. {...}:  匿名内部类额内容
*
* 额外注意：
* 1. 匿名内部类：【创建对象】时，只能使用唯一一次。多次创建对象，且内容一样，则必须使用单独定义实现类
* 2. 匿名对象：在【调用方法】时，只能调用唯一一次。同一个对象调用多次方法则必须有名字
* 3. 匿名内部类省略了【实现类/子类名称】，但匿名对象省略了【对象名称】
* 强调：【匿名内部类 ≠ 匿名对象】
* */

public class DemoMain {

    public static void main(String[] args) {
//        MyInterface obj = new MyInterfaceImpl();
//        obj.method();
//
//        MyInterface some = new MyInterface(); 错误写法

        // 使用匿名内部类，但不是匿名对象，对象名称就叫objA
        MyInterface objA = new MyInterface() {
            @Override
            public void method1() {
                System.out.println("实现类覆盖重写方法1-A");
            }

            @Override
            public void method2() {
                System.out.println("实现类覆盖重写方法2-A");
            }
        };

        objA.method1();
        objA.method2();
        System.out.println("===========================");

        // 使用匿名内部类。而且省略了对象名称，亦是匿名对象
        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("实现类覆盖重写方法1-B");
            }

            @Override
            public void method2() {
                System.out.println("实现类覆盖重写方法2-B");
            }
        }.method1();

//==========================================================
        // 因为匿名对象无法调用第二次方法，所以需要再创建一个对象
        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("实现类覆盖重写方法1-B");
            }

            @Override
            public void method2() {
                System.out.println("实现类覆盖重写方法2-B");
            }
        }.method2();
    }
}
