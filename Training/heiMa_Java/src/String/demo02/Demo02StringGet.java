package String.demo02;

/*
 * String当中与获取相关的常用方法
 *
 * public int length()：                 获取字符串当中含有字符个数，拿到字符串长度
 * public String concat(String str)：    将当前字符串和参数字符串拼接成返回值的新字符串
 * public char charAt(int index)：       获取指定位置的单个字符。(索引从0开始)
 * public int indexOF(String str)：      查找字符串在本字符串当中首次出现的索引位置，如果没有则返回-1值
 * */

public class Demo02StringGet {

    public static void main(String[] args) {
        // 获取字符串长度
        int length = "asipdfnasdighasda".length();
        System.out.println("字符串长度：" + length);

        // 拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1); // Hello，不变
        System.out.println(str2); // World，不变
        System.out.println(str3); // HelloWorld，新的字符串(字符串只要有变动必然是创建新字符串)
        System.out.println("=========");

        // 获取指定索引位置的单个字符
        char ch = "Hello".charAt(1);
        System.out.println(ch);
        System.out.println("=========");

        // 查找参数字符串本来字符串当中出现的第一次索引位置
        // 如果没有返回-1
        String original = "HelloWorld";
        int index = original.indexOf("llo"); // 2
        System.out.println(index);
        System.out.println(original.indexOf("abc")); // -1
    }
}
