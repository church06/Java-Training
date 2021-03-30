package C1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C15 {

    public static void main(String[] args) {
        int counter = 0;
        double[] list = new double[2];
        while (counter < 2) {
            System.out.print("输入double：");
            while (true) {
                try {
                    double input = new Scanner(System.in).nextDouble();
                    list[counter] = input;
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("输入错误");
                }
            }
            counter++;
        }

        if ((list[0] < 1 && list[0] > 0) && (list[1] < 1 && list[1] > 0)) {
            System.out.println("true");
        }
    }
}
