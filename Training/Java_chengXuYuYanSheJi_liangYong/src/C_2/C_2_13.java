package C_2;

import java.util.Scanner;

public class C_2_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();
        int month = 6;
        double rate = 1 + 0.05 / 12;
        double deposit = 0;

        for (int i = 0; i < month; i++) {
            deposit += input;
            deposit *= rate;
        }

        System.out.println(deposit);
    }
}
