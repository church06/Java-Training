package C_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class C_3_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        try {
            String[] IBSN_code = ("0" + input).trim().split("");
            System.out.println(Arrays.toString(IBSN_code));

            // 校验码计算
            int counter = 0;
            int time = 1;
            for (String i : IBSN_code) {
                int num = Integer.parseInt(i);
                counter += num * time;
                ++time;
            }
            counter %= 11;

            String input_9 = "0" + input;
            ArrayList<String> IBSN = new ArrayList<String>(Collections.singleton(input_9));

            // 校验码识别
            if (counter == 10) {
                IBSN.add("X");
                System.out.println(IBSN.get(0) + IBSN.get(1));
            } else {
                IBSN.add("1");
                System.out.println(IBSN.get(0) + IBSN.get(1));
            }

        } catch (NumberFormatException e) {
            System.out.println("?????\nWrong input!!!!!!");
        }
    }
}
