package Final.demo01;

/*
 * final 关键字代表最终、不可更改的
 *
 * 常用4种用法：
 * 1. 修饰一个类
 * 2. 修饰一个方法
 * 3. 修饰一个局部变量
 * 4. 修饰一个成员变量
 * */

public class Demo01Final {

    public static void main(String[] args) {
        int num1 = 10;
        System.out.println("num1: " + num1);
        num1 = 20;
        System.out.println("num1: " + num1);

        // 一旦使用final修饰局部变量，那么该变量不能被更改
        // 一次赋值，终生不变
        final int num2 = 200;
        System.out.println("num2: " + num2);
//      num2 = 250; 错误写法

        // 正确写法只要保证唯一一次赋值即可
        final int num3;
        num3 = 30;
        System.out.println("num3: " + num3);
        System.out.println("================================");

        // 对于基本类型来说，不可变指 变量中  数据不可变
        // 对于引用类型来说，不可变指 变量中  地址值不可变
        Student stu1 = new Student("22");
        System.out.println(stu1);
        System.out.println(stu1.getName());
        stu1 = new Student("33");
        System.out.println(stu1);
        System.out.println(stu1.getName());
        System.out.println("===============================");

        final Student stu2 = new Student("11");
        System.out.println(stu2);
        // 错误写法，final的引用类型变量，其中地址值不可改变
//      stu2 = new Student("44");
        stu2.setName("s;ijghd;lsd");
        System.out.println(stu2.getName());

    }
}
