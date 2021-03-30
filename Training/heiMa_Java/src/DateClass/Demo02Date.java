package DateClass;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        demo01();
        System.out.println("============================");
        demo02();
    }

    /*
    * Date类的带参数构造方法
    * Date(long date)：传递毫秒值，把毫秒值转换为Date日期
    *
    * */
    private static void demo02() {
        Date date = new Date(0L);
        System.out.println("0L: " + date);

        date = new Date(153553153515338435L); // Thu Jan 01 08:00:00 CST 1970
        System.out.println("153553153515338435L: " + date); // Fri Sep 24 10:15:38 CST 4867875
    }

    /*
    * Date类的空参数构造方法
    * Date()获取当前系统的日期和时间
    * */
    private static void demo01() {
        Date date = new Date();
        System.out.println(date); // 获取当前时间
    }
}
