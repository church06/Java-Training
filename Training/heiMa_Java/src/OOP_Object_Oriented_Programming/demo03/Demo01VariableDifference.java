package OOP_Object_Oriented_Programming.demo03;

/*
* 局部变量与成员变量
* 1. 定义位置不同
*   局部变量：方法内部
*   成员变量：方法外部，直接写在类中
*
* 2. 作用范围不同
*   局部变量：只有方法中才可以使用，出了方法则不能再用
*   成员变量：整个类通用
*
* 3. 默认值不同
*   局部变量：没有默认值，想要使用必须手动进行赋值
*   成员变量：若没有赋值则会有默认值，规则和数组相同
*
* 4. 内存位置不同
*   局部变量：位于栈内存
*   成员变量：位于堆内存
*
* 5. 生命周期不同
*   局部变量：随方法进栈而诞生，随方法出栈而消失
*   成员变量：随对象创建而诞生，随对象被垃圾回收而消失
* */

public class Demo01VariableDifference {

    String name; // 成员变量
    public void methodA() {
        int num = 20; // 局部变量
        System.out.println(num);
        System.out.println(name);
    }

    public void methodB(int param) {
        System.out.println(param);
    }
}
