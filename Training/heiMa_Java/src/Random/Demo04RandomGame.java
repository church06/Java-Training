package Random;

/*
 * 题目：
 * 用代码模拟猜数字的小游戏。
 *
 * 思路：
 * 1. 首先需要产生一个随机数字，并且一旦产生不再变化。用Random的nextInt()方法
 * 2. 需要键盘输入，所以用到了Scanner
 * 3. 获取键盘输出的数字，用Scanner当中的nextInt方法
 * 4. 已经得到了两个数字，判断(if)一下
 *   如果太大了，提示太大，并重试
 *   如果太小了，提示太小，并重试
 * 5. 重试就是再来一次
 * */

import java.util.Random;
import java.util.Scanner;

public class Demo04RandomGame {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int target = r.nextInt(100) + 1; // [1 , 100]
        int count = 10;
        while (true) {
            if (count == 0) {
                System.out.println("你输了");
                break;

            } else if (input < target) {
                count--;
                System.out.println("过小重猜，剩余次数：" + count);
                input = sc.nextInt();

            } else if (input == target) {
                System.out.println("你赢了");
                break;

            } else if (input > target) {
                count--;
                System.out.println("过大重猜，剩余次数：" + count);
                input = sc.nextInt();

            } else {
                System.out.println("Error input");
                input = sc.nextInt();
            }
        }

    }
}
