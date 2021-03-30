package String.demo02;

/*
 * 题目：
 * 键盘输入一个字符串，并且统计各种字符出现的次数
 * 特有类：大写，小写，数字，其他
 *
 * 思路：
 * 1. 既然用到键盘输入，肯定是Scanner
 * 2. 键盘输入字符串，String str = sc.next();
 * 3. 定义四个变量，分辨代表4种字符各自出现次数
 * 4. 需要对字符串挨个检查，String --> char[]，方法用toArray()
 * 5. 遍历char[]字符数组，对当前字符种类判断，并用4个变量进行++操作
 * 6. 打印输出4个变量，分别代表4中字符出现次数
 * */

import java.util.Scanner;

public class Demo07StringCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input char: ");
        String input = sc.next();

        int CountUpper = 0;
        int CountLower = 0;
        int CountNumber = 0;
        int CountOther = 0;

        char[] charArray = input.toCharArray();
        for (char ch : charArray) {
            if ('A' <= ch && ch <= 'Z') {
                CountUpper++;
            } else if ('a' <= ch && ch <= 'z') {
                CountLower++;
            } else if('0' <= ch && ch<='9') {
                CountNumber++;
            } else {
                CountOther++;
            }
        }
        System.out.println("大写字母有：" + CountUpper);
        System.out.println("小写字母有：" + CountLower);
        System.out.println("数字有：" + CountNumber);
        System.out.println("其他：" + CountOther);
    }
}
