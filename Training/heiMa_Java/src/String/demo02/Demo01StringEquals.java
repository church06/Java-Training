package String.demo02;

/*
 * ==是进行对象的地址值比较，如果确实需要字符串内容比较，可以使用两个方法
 * public boolean equals(Object obj)，参数可以是任何对象，只有参数是资格字符串并且内容相同才会给true，否则返回false
 *
 * 注意事项：
 * 1. 任何对象都能Object进行接收
 * 2. equals方法具有对称性，也就是equals(b)和b.equals(a)效果一样
 * 3. 如果比较双方一个常量一个变量，推荐将常量字符串写在前面
 * 推荐："abc".equals(str)     不推荐："str".equals("abc")
 *
 * public boolean equalsIgnoreCase(String str)，忽略大小写进行内容比较
 * */

public class Demo01StringEquals {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2)); //true
        System.out.println(str2.equals(str3)); // true
        System.out.println(str3.equals("Hello")); // true
        System.out.println("Hello".equals(str1)); //true
        System.out.println("hello".equals(str1)); // false

        String str5 = null;
        System.out.println("abc".equals(str5)); // 推荐，false
        //System.out.println(str5.equals("anc")); // 不推荐，报错，空指针异常NullPointerException
        System.out.println("====================");

        String strA = "Java";
        String strB = "java";
        System.out.println(strA.equals(strB)); // false，严格区分大小写
        System.out.println(strA.equalsIgnoreCase(strB)); // true

        // 只有英文区分大小写，其他均不区分
        System.out.println("abc一123".equalsIgnoreCase("abc壹123"));
    }
}
