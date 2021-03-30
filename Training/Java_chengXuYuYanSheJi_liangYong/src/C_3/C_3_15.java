package C_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class C_3_15 {

    public static void main(String[] args) {
        Random r = new Random();
        int[] code = {r.nextInt(10), r.nextInt(10), r.nextInt(10)};
        System.out.println(Arrays.toString(code));

        Scanner sc = new Scanner(System.in);
        System.out.println("输入抽奖号码：");

        int input;

        while (true) {
            try {
                input = sc.nextInt();
                 break;
            } catch (NumberFormatException e) {
                System.out.println("格式错误。");
            }
        }

        String inputStr = String.valueOf(input);
        int[] input_code = new int[inputStr.length()];

        for (int i = 0; i < inputStr.length(); i++) {
            int num = Integer.parseInt(inputStr.charAt(i)+"");
            input_code[i] = num;
        }

        for (int i = 0; i < input_code.length; i++) {
            for (int j = i + 1; j < input_code.length; j++) {
                if (input_code[i] == input_code[j]) {
                    input_code[j] = 108;
                }
            }
        }

        int counter = 0;
        for (int j : input_code) {
            for (int k : code) {
                if (j == k) {
                    counter++;
                }
            }
        }

        if (counter < 3 && counter != 0) {
            System.out.println("奖金 1,000。");
        } else if(Arrays.equals(input_code, code)) {
            System.out.println("奖金10,000。");
        } else if (counter == 3) {
            System.out.println("奖金3,000。");
        } else {
            System.out.println("未中奖。");
        }
    }
}
