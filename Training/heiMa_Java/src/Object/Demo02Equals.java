package Object;

import java.util.ArrayList;

public class Demo02Equals {

    public static void main(String[] args) {
        /*
         * Person类默认继承Object类，所以可以使用Object类的equals方法
         * boolean equals(Object obj)指示其他某个对象是否与此对象"相等"
         * equals方法源码：
         * public boolean equals(Object obj) {
         *    return (this == obj);
         * }
         *
         * 参数：
         * Object obj：可以传递任意对象
         * == 比较运算符：返回布尔值 true/false
         * 基本数据类型：比较值
         * 引用数据类型：比较地址值
         * this: 调用方法的对象
         * obj: 传递来的参数
         * this == obj --> p1 == p2
         * */

        Person p1 = new Person("P1", 18);
        Person p2 = new Person("P2", 19);
        System.out.println("P1: " + p1);
        System.out.println("P2: " + p2);

//        p1 = p2;
        ArrayList<String> list = new ArrayList<>();

        boolean b = p1.equals(list);
        System.out.println(b);

    }
}
