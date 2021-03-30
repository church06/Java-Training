package Scanner;

/*
* 题目：
* 键盘输入三个int数字，求出其最大值
*
* 思路：
* 1. 既然是键盘输入，肯定需要Scanner
* 2. Scanner三个步骤：导包、创建、使用nextInt()
* 3. 既然是三个数字，那么调用三次nextInt()方法，得到三个int变量
* 4. 无法同时三个数字谁最大，应转换为两个步骤：
*   4.1 首先判断前两个当中谁最大，拿到前两个的最大值
*   4.2 那这按两个中的最大值，在和第三个数字比较，得到三个数字当中的最大值
* 5. 打印最终结果
* */

import java.util.Scanner;

public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字");
        int b = sc.nextInt();
        System.out.println("请输入第三个数字");
        int c = sc.nextInt();

        int temp = Math.max(a, b);
        int max = Math.max(temp, c);
        System.out.println("最大值：" + max);
    }
}
