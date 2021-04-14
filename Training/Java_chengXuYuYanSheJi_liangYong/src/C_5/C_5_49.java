package C_5;

import java.util.ArrayList;
import java.util.Scanner;

public class C_5_49 {

    public static void main(String[] args) {
        C549_method();
    }

    public static void C549_method() {

        while (true) {
            System.out.println("输入文字计算元音辅音: ");
            String input = new Scanner(System.in).nextLine();

            if (input.equalsIgnoreCase("n")) {
                break;
            }

            int counter_vowels = 0;
            int counter_consonants = 0;

            ArrayList<Character> letters = new ArrayList<>(Letter_Generator());


            for (int i = 0; i < input.length(); i++) {
                boolean counter = false;

                if (input.charAt(i) == 'A' || input.charAt(i) == 'a' ||
                        input.charAt(i) == 'E' || input.charAt(i) == 'e' ||
                        input.charAt(i) == 'I' || input.charAt(i) == 'i' ||
                        input.charAt(i) == 'O' || input.charAt(i) == 'o' ||
                        input.charAt(i) == 'U' || input.charAt(i) == 'u') {
                    counter_vowels++;
                    continue;
                } else {

                    for (char j : letters) {
                        if (j == input.charAt(i)) {
                            counter = true;
                            break;
                        }
                    }

                    if (counter) {
                        counter_consonants++;
                    }
                }
            }

            System.out.println("元音: " + counter_vowels + "\n" + "辅音: " + counter_consonants);
        }
        System.out.println("程序结束");
    }

    public static ArrayList<Character> Letter_Generator() {

        ArrayList<Character> output = new ArrayList<>();

        for (int i = 65; i <=122 ; i++) {

            char letter;

            if (i == 91) {
                i = 97;
            }

            letter = (char) i;
            output.add(letter);
        }
        return output;
    }
}
