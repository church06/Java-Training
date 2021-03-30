package Random;

/*
* Random类用来生成随机数字，使用起来也是三个步骤
* 1. 导包
* import ava.util.Random
*
* 2. 创建
* Random r = new Random(); // 小括号当中留空即可
*
* 3. 使用
* 获取一个随机int数字（范围是int所有范围）：int num = r.nextInt();
* 获取一个随机int数字（参数代表范伟，左闭右开区间）：int num = r.nextInt(3)
* 实际代表含义是：[0, 3)，也就是说0~2
* */

import java.util.Random;

public class Demo01Random {

    public static void main(String[] args) {
        Random r = new Random();

        int num = r.nextInt();
        System.out.println("随机数是：" + num);
    }
}
