package Scanner;

import java.util.Scanner;

/*
 * Scanner类的功能，可以实现键盘输入数据到程序中
 * 引用类型的一般使用步骤：
 *
 * 1. 导包
 * import 包路径.类名称;
 * 如果需要使用目标类，和当前类位于同一个包下，则可以省略导包语句不写
 * 只有java.lang下的内容不需要导包，其他都需要import语句
 *
 * 2. 创建
 * 类名称 对象名 = new 类名称();
 *
 * 3. 使用
 * 对象名.成员方法名()
 * */
public class Demo01Scanner {

    public static void main(String[] args) {
        // 2. 创建
        // System.in 代表从键盘进行输入
        Scanner sc = new Scanner(System.in);

        // 3. 获取键盘输入的int数字
        int num = sc.nextInt();
        System.out.println("输入的int是：" + num);

        // 4. 获取键盘输入的字符串
        String str = sc.nextLine();
        System.out.println("输入的字符串是：" + str);
    }
}
