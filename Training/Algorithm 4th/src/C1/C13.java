package C1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C13 {

    public static void main(String[] args) {
        int counter = 1;
        int[] list = new int[3];
        while (counter <= 3) {
            System.out.print("输入整数" + counter + "：");

            while (true) {
                try {
                    int input = new Scanner(System.in).nextInt();
                    list[counter - 1] = input;
                    break;
                }catch (InputMismatchException e) {
                    System.out.print("输入错误");
                }
            }
            counter++;
        }

        if (list[0] == list[1]&&list[1] ==list[2]) {
            System.out.println("equal");
        } else {
            System.out.println("unequal");
        }
    }
}
