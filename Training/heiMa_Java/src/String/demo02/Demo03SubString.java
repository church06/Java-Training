package String.demo02;

/*
 * 字符串
 *
 * public String substring(int index)：截取从参数为止一直到字符串末尾，返回新字符串
 * public String substring(int begin, int end)：截取从begin开始，直到end结束中间的字符串
 *
 * 备注：[begin, end)，包含左边，不会包含邮右边
 * */

public class Demo03SubString {

    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("========");

        String str3 = str1.substring(4, 7);
        System.out.println(str3);
        System.out.println("============");

        // 下面这种写法字符串仍然没有改变
        // 下面两个字符串："Hello", "Java"
        // strA当中保存的是地址值
        // 本来地址只是Hello的0x666
        // 后来地址变成Java的0x999
        String strA = "Hello";
        System.out.println(strA); // Hello
        strA = "Java";
        System.out.println(strA); // Java
    }
}
