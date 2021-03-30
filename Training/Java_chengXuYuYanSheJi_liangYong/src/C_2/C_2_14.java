package C_2;

import java.util.Scanner;

public class C_2_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入体重(磅)：");
        double weight = sc.nextDouble();

        System.out.println("输入身高(英尺)：");
        double height = sc.nextDouble();

        double kg = 0.45359237 * weight;
        double h_m = 0.0254 * height;

        double BMI = kg / Math.pow(h_m, 2);
        System.out.println(BMI);
    }
}
