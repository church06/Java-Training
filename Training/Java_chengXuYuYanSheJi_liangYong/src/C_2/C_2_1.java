package C_2;

import java.util.Scanner;

public class C_2_1 {

    public static void main(String[] args) {
        System.out.println("输入摄氏度：");
        Scanner sc = new Scanner(System.in);
        double input_C = sc.nextDouble();
        double Fahrenheit = input_C * (9.0 / 5.0) + 32;
        System.out.println(Fahrenheit);

    }
}
