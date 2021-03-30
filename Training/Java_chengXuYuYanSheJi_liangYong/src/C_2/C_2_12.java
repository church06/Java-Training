package C_2;

import java.util.Scanner;

public class C_2_12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("输入加速度和起飞速度 - 空格分割：");

        String input = sc.nextLine();
        String[] data = input.split(" ");
        double a = Double.parseDouble(data[0]);
        double v = Double.parseDouble(data[1]);
        double wayLong = Math.pow(v, 2) / (2 * a);
        System.out.println(wayLong);
    }



}
