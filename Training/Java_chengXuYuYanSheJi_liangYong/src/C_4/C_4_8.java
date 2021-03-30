package C_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C_4_8 {
    public static void main(String[] args) {
        try {
            System.out.println("输入数字：");
            char input = (char) new Scanner(System.in).nextInt();
            System.out.println(input);

        } catch (InputMismatchException e) {
            System.out.println("???");
        }
    }
}
