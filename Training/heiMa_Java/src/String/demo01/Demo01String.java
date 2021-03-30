package String.demo01;

/*
 * java.lang.String类代表字符串
 * API当中说：Java程序中的所有字符串字面值(如"abc")都作为此类实例体现
 * 就是说：程序当中所有双引号字符串，都是String类的对象(就算没有new，也是)
 *
 * 字符串的特点
 * 1. 字符串内容用不可更改【重点】
 * 2. 因为字符串不可改变，所以可以被共享使用
 * 3. 字符串效果上先锋党羽char[]字符数组，但是底层原理是byte[]字节数组
 *
 * 创建字符串的常见3+1种方式
 * public String()，创建一个空白字符串，不含有任何内容
 * public String(char[] array)，根据字符数组的内容，创建对应字符串
 * public String(byte[] array)，根据字符数组的内容，创建对应字符串
 * 直接创建：
 * String str = "Hello"; 邮编直接用双引号
 * 注意：只写双引号，就是字符串对象
 * */

public class Demo01String {

    public static void main(String[] args) {

        //空参构造
        String str1 = new String(); // 小括号留空，说明无内容
        System.out.println("字符串1：" + str1);

        // 根据字符数组创建创建字符串
        char[] c = {'a', 'b', 'c'};
        String str2 = new String(c);
        System.out.println("字符串2：" + str2);

        //根据字节数组创建字符串
        byte[] b = {97, 98, 99};
        String str3 = new String(b);
        System.out.println("字符串3：" + str3);

        String str4 = "Hello";
        System.out.println("字符串4：" + str4);
    }
}
