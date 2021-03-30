package C_3;

import java.util.Random;
import java.util.Scanner;

public class C_3_14 {

    Random r = new Random();
    int coin = r.nextInt(2);

    public static void main(String[] args) {

        C_3_14 c314 = new C_3_14();

        Scanner sc = new Scanner(System.in);
        System.out.println("Guess coin.");
        int input = sc.nextInt();

        while (input != 999) {
            try {
                c314.coinDetect(input);
                System.out.println("Guess again.");
                input = sc.nextInt();
            } catch (NumberFormatException e) {
                System.out.println("???");
            }
        }
        System.out.println("Exit.");


    }

    private void coinDetect (int input) {
        if (input == coin) {
            System.out.println("Correct.");
            coin = r.nextInt(2);
        } else if (input >= 2){
            System.out.println("???");
        } else {
            System.out.println("Incorrect.");
            coin = r.nextInt(2);
        }
    }
}
