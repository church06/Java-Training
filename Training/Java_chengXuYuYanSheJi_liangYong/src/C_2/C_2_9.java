package C_2;

import java.util.Scanner;

public class C_2_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入初速度：");
        double original_sp = sc.nextDouble();
        System.out.println("输入终止速度：");
        double final_sp = sc.nextDouble();
        System.out.println("输入持续时间：");
        double t = sc.nextDouble();

        double avg_sp = (final_sp - original_sp) / t;
        System.out.println(avg_sp);
    }
}
