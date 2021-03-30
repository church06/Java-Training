package C_2;

import java.util.Scanner;

public class C_2_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入水的重量：");
        double weight = sc.nextDouble();
        System.out.println("输入水的温度：");
        double temp = sc.nextDouble();
        System.out.println("输入需要加热到的温度：");
        double temp_f = sc.nextDouble();

        double energy = weight * (temp_f - temp) * 4184;

        System.out.println(energy);
    }
}
