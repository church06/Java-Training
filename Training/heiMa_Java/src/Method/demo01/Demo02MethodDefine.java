package Method.demo01;

/*
 * 方法是若干语句的功能集合
 * 方法如同工厂
 * 蒙牛工厂      原料: 奶牛，饲料，水
 *             产出物: 奶制品
 * 钢铁工厂      原料: 铁矿石，煤炭
 *             产出物：钢铁建材
 *
 * 参数(原料): 进入方法的数据
 * 返回值(产出物): 从方法中出来的数据
 *
 * 定义方法的完整格式:
 * 修饰符 返回值类型 方法名称(参数类型 参数名称, ...) {
 *     方法体
 *     return 返回值;
 * }
 *
 * 修饰符: public, static
 * 返回值类型: 进入方法的数据是什么类型
 * 参数名称: 进入方法的数据对应的变量名称
 * PS: 参数如有多个则使用","分隔
 *
 * 方法体: 方法需要做的事情, 若干行代码
 * return: 两个作用：1. 停止当前方法
 *                 2. 将后面的返回值换个调用处
 * 返回值：方法执行后最终产生的数据结果
 *
 * 注意：return后的"返回值"，必须和方法名称前面的"返回值类型"，保持对应
 *
 * 返回值类型：int
 * 方法名称：sum
 * 参数列表：int a， int b
 *
 * 方法的三种调用：
 * 1. 单独调用：方法名称(参数);
 * 2. 打印调用：System.out.println(方法名称(参数));
 * 3. 赋值调用：数据类型 变量名称 = 方法名称(参数);
 *
 * 方法调用流程：
 * 1. 找到方法
 * 2. 参数传递
 * 3. 执行方法体
 * 4. 带着返回值回到方法的调用处(谁调用，还给谁)
 */

import java.util.Scanner;

public class Demo02MethodDefine {
    public static void main(String[] arga) {
        System.out.println("Inter a number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Inter another number: ");
        int b = sc.nextInt();
        //打印调用
        System.out.println("打印调用：" + sum(a, b));
        //赋值调用
        int number = sum(a, b);
        System.out.println("赋值调用：" + number);

    }

    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }
}
