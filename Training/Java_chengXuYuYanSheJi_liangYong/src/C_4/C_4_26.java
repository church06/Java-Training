package C_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C_4_26 {

    public static void main(String[] args) {

        C_4_26 c426 = new C_4_26();
        c426.c426_Method();

    }

    public void c426_Method() {

        boolean counter = false;
        double input = 0;

        do {
            try {
                System.out.println("输入如钱数：");
                input = new Scanner(System.in).nextDouble();
                counter = true;
            } catch (InputMismatchException e) {
                System.out.println("输入错误");
            }
        } while (!counter);

        String[] units = Double.toString(input).split("\\.");

        System.out.println(units[0] + " 元 " + units[1] + " 分");
    }
}
