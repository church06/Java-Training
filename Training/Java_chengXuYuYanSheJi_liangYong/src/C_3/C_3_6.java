package C_3;

import java.util.Scanner;

public class C_3_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        C_3_6 c36 = new C_3_6();

        System.out.println("输入体重：");
        double weight = sc.nextDouble();

        System.out.println("输入英尺：");
        double feet = sc.nextDouble();

        System.out.println("输入英寸：");
        int inch = sc.nextInt();

        double height = c36.inch_feet_meter(feet, inch);
        double bmi = c36.BMI(weight, height);
        System.out.println("BMI数值为：" + bmi + "，属于：" + c36.BMI_mea(bmi));

    }

    private double BMI(double weight, double height) {

        return (weight * 0.454) / Math.pow(height, 2);
    }

    private double inch_feet_meter(double feet, int inch) {

        return (inch / 12.0 + feet) / 3.28;
    }

    private String BMI_mea(double BMI) {
        String output = null;
        if (BMI < 18.5) {
            output = "偏瘦";
        } else if (BMI >= 18.5 && BMI < 23.9) {
            output = "正常";
        } else if (BMI >= 23.9 && BMI < 27.9) {
            output = "超重";
        } else if (BMI >= 27.9) {
            output = "肥胖";
        } else {
            output = "???????";
        }

        return output;
    }
}
