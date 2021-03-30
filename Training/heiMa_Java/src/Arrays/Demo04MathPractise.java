package Arrays;

/*
 * 题目：
 * 计算在-10.8到5.9之间，绝对值大于6或小于2.1的整数有多少个
 *
 * 分析：
 * 1. 确定范围，for循环
 * 2. 起点位置-10.8可转换成-10，两种办法：
 *    2.1 Math.ceil方法，向上取整
 *    2.2 爱昂志转换为int，自动舍弃所有小数
 * 3. 每个数字都是整数，所以步进表达式应为num++，每次都+1
 * 4. 绝对值：Math.abs
 * 一旦发现一个数字，则让计数器++进行统计
 *
 * 备注：
 * 1. 如果Math.ceil，-10.0可编变成-10。
 * 2. double也可以++
 * */

public class Demo04MathPractise {

    public static void main(String[] args) {
        // 符合要求的数量
        int count = 0;

        double min = -10.8;
        double max = 5.9;
        // 这样处理可让i是区间所有整数
        for (int i = (int) min; i < max; i++) {
            int abs = Math.abs(i);
            if (abs > 6 || abs < 2.1) {
                count++;
                System.out.println("总数：" + count);
            }
        }
    }
}
