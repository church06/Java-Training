package C_3;

import java.util.ArrayList;
import java.util.Scanner;

public class C_3_12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        try {
            char[] input_str = String.valueOf(input).toCharArray();

            ArrayList<Character> reverse = new ArrayList<>();
            ArrayList<Character> positive = new ArrayList<>();

            for (char i : input_str) {
                positive.add(i);
            }

            for (int i = input_str.length - 1; i >= 0; i--) {
                reverse.add(input_str[i]);
            }

            if (reverse.equals(positive)) {
                System.out.println("是回文数字");
            } else {
                System.out.println("非回文数字");
            }

        } catch (NumberFormatException e) {
            System.out.println("??????????");
        }
    }
}
