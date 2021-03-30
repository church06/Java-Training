package Object;

/*
 * java.lang.Object
 * 类Object是类层次的父类
 * 每个类(Person, Student, ...)都使用Object作为父类
 * 所有对象(包括数组)都实现这个类的用法
 * */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Demo01ToString {

    public static void main(String[] args) {
        /*
         * Person类默认继承Object类，所以可以使用Object类中的toString()方法
         * String toString()返回该对象的字符串表示
         * */

        Person person = new Person("233", 18);
        String s = person.toString();
        System.out.println(s);

        // 直接打印对象的名字，其实就是调用对象的toString
        System.out.println(person);

        // 一个类是否重写了toString，直接打印这个类的对象即可，如果没有重写toString方法，那么打印的对象是地址值
        Scanner sc = new Scanner(System.in);
        System.out.println("Scanner: " + sc);
        Random r = new Random();
        System.out.println("Random: " + r);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("ArrayList: " + list);

    }
}
