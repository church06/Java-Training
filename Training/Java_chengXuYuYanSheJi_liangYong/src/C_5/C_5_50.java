package C_5;

import java.util.ArrayList;
import java.util.Scanner;

public class C_5_50 {

    public static void main(String[] args) {
        C550_method();
    }

    public static void C550_method() {

        ArrayList<Character> Uppercase = new ArrayList<>(UpperCase_Letter_Generator());

        while (true) {
            System.out.println("输入字母检查大写数量: ");
            String input = new Scanner(System.in).nextLine();

            if (input.equalsIgnoreCase("n")) {
                break;
            }

            int counter = 0;

            for (int i = 0; i < input.length(); i++) {

                char current = input.charAt(i);

                for (char j : Uppercase) {
                    if (j == current) {
                        counter++;
                    }
                }
            }

            System.out.println("大写字母为: " + counter);
        }

        System.out.println("程序结束");

    }
    
    public static ArrayList<Character> UpperCase_Letter_Generator() {

        ArrayList<Character> output = new ArrayList<>();

        for (int i = 65; i <= 90; i++) {
            char letter = (char) i;
            output.add(letter);
        }

        return output;
    }
}
