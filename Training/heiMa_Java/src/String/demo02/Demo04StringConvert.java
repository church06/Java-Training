package String.demo02;

/*
* String 当中与转换相关的常用方法
*
* public char[] toCharArray()：将当前字符串拆分成为字符数组作为返回值
* public byte[] getBytes()：获得当前字符串底层字节数组
* public String replace(CharSequence oldString, CharSequence newString)：
* 将所有出现的老字符替换成新的字符串，返回替换之后的新字符串结果
* */

public class Demo04StringConvert {
    public static void main(String[] args) {

        // 转换成字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("===============");

        // 转换为字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("===============");

        // 字符串的内容错误
        String str1 = "How do you do?";
        String str2 = str1.replace("o", "*");
        System.out.println(str1); // How do you do?
        System.out.println(str2); // H*w d* y*u d*?

        String lang1 = "yyyyyy! wdnmd! wdnmd! wdnmd!!!";
        String lang2 = lang1.replace("wdnmd", "*****");
        System.out.println(lang2); // yyyyyy! *****! *****! *****!!!
    }
}
