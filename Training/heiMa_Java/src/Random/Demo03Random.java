package Random;

/*
 * 题目要求：
 * 歌女int变量n的值，来获取随机数字，范围是[1, n]，可以取到1也能取到n
 *
 * 思路：
 * 1. 定义int变量n，随意赋值
 * 2. 要使用Random，三个步骤：导包、创建、使用
 * 3. 如果写10，那么就是0 ~ 9，然而想要1 ~ 10，可以发现整体+1即可
 * 4. 打印随机数字
 * */

import java.util.Random;

public class Demo03Random {

    public static void main(String[] args) {
        int n = 5;
        Random r = new Random();

        for (int i = 0; i < 50; i++) {
            // 本来范围是[0, n)，整体+1后变成[1, n + 1)，也就是说[1, n]
            int result = r.nextInt(n) + 1;
            System.out.printf(result + " ");
        }
        System.out.println();
        System.out.println("==========");

        for (int i = 0; i < 50; i++) {
            int result = r.nextInt(n + 1);
            System.out.printf(result + " ");
        }
    }
}
