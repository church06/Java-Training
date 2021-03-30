package DateClass;

/*
* java.util.Data：表示日期和时间的类
* Date类表示特定瞬间，精确到毫秒
* ms：1000ms = 1s
*
* 毫秒值作用：对日期和时间进行计算
* 将日期转换为毫秒进行计算，之后转换为日期
* 1. 获取当前日期
* 2. 时间原点：1970年1月1日00:00:00
* 3. 将毫秒转换为日期：1d = 24 × 60 × 60 = 86,400 s
*                     = 86,400 × 1,000 = 86,400,000 ms
* */

public class Demo01Date {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
    }
}
