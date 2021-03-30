package Method.demo01;

/*
* 有参数：小括号中有内容。当一个方法需要数据条件才能完成任务时，即为有参数
* 如：两个数字相加必须知道两个数字各自是多少。
*
* 无参数：小括号中留空。一个方法不需要任何数据条件，独立完成任务，即为无参数
* 如：定义一个方法固定打印10次Hello World。
*
* */
public class Demo03MethodParam {
    public static void main(String[] args) {
        method(999, 654);
        System.out.println("*".repeat(10));
        method2();
    }
    //两个数字相乘必须知道两个数字各自是多少，否则无法计算
    public static void method(int a, int b) {
        int result = a * b;
        System.out.println("结果为：" + result);
    }

    //打印固定文本
    public static void method2() {
        for(int i = 0; i <10; i++) {
            System.out.println("Hello World" + i);
        }
    }
}
