package Method.demo03;

public class Demo01MethodOverload {
    public static void main(String[] args) {
        /*
         * 方法的重载(Overload)
         * 多个方法名称一样但参数列表不同
         *
         * 只需要记住一个方法名称便可实现多个类似功能
         *
         * 方法重载与下列因素相关：
         * 1. 参数个数不同
         * 2. 参数类型不同
         * 3. 参数多类型但顺序不同
         *
         * 与下列因素无关：
         * 1. 参数名称
         * 2. 方法的返回值类型
         */
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));
        System.out.println(sum(1.7, 16.4));
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static int sum(double a, double b) {
        return (int) (a + b);
    }

    private static int sum(int a, int b, int c) {
        return a + b + c;
    }

    private static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
