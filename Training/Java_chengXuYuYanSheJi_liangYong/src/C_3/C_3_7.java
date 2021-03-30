package C_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C_3_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        C_3_7 c37 = new C_3_7();

        System.out.println("输入钱数 (整数)：");
        int input = 0;

        try {
            input = sc.nextInt();

            int pennies = input % 100;
            int dollars = (input - pennies) / 100;



            System.out.println(c37.dollarCounterAppear(dollars) + c37.pennyCounterAppear(pennies));

        } catch (InputMismatchException e) {
            System.out.println("?????????\n请输入人整数！！！！！");
        }
    }

    private String pennyCounterAppear (int pennies) {

        String output = null;

        switch (pennies) {
            case 0:
                output = "";
                break;
            case 1:
                output = pennies + " penny。";
                break;
            default:
                output =  pennies + " pennies。";
        }

        return output;
    }

    private String dollarCounterAppear (int dollars) {

        String output = null;

        switch (dollars) {
            case 0:
                output = "";
                break;
            case 1:
                output = dollars + " dollar ";
                break;
            default:
                output =  dollars + " dollars ";
        }

        return output;
    }
}
