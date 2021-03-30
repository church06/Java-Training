package Object;

import java.util.Objects;

public class Demo03Objects {
    public static void main(String[] args) {
        // String s1 = "abc";
        String s1 = null;
        String s2 = "abc";

        try {
            boolean b = s1.equals(s2); // NullPointerException空指针异常。null不能调用方法
        } catch (NullPointerException e) {
            System.out.println("b = s1.equals(s2); 发生空指针异常");
        }

        /*
        * Objects类的equals方法：对两个对象进行比较，防止空指针异常
        * */

        boolean b2 = Objects.equals(s1, s2);
        System.out.println("b2 = Objects.equals(s1, s2); " + b2);
    }
}
