package Anonymous;

import java.util.Scanner;

public class Demo02Anonymous {

    public static void main(String[] args) {
        // 普通使用方式
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

        // 匿名使用方式
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("输入的是：" + num);

        //使用一般写法传入参数
//        Scanner sc = new Scanner(System.in);
//        methodParam(sc);

        //使用匿名对象进行传参
//        methodParam(new Scanner(System.in));

        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("输入的是" + num);
    }

    private static void methodParam(Scanner scanner) {
        int i = scanner.nextInt();
        System.out.println("输入的是：" + i);
    }

    public static Scanner methodReturn() {
//        Scanner sc  = new Scanner(System.in);
//        return sc;
        return new Scanner(System.in);
    }
}
