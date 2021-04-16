package C_6;

import java.util.Arrays;

public class C_6_6 {

    public static void main(String[] args) {
        C66_method();
    }

    public static void C66_method() {
        displayPattern(7);
    }

    public static void displayPattern(int n) {
        int[] list = new int[n];

        for (int i = 1; i <= n; i++) {
            list[n - i] = i;

            System.out.println(print(list));
        }

    }

    private static String print(int[] input) {

        StringBuilder ouput = new StringBuilder();

        for (int i : input) {

            if (i == 0) {
                ouput.append("  ");

            } else {
                if (i != input[input.length - 1]) {
                    ouput.append(i).append(" ");

                } else {
                    ouput.append(i);
                }
            }
        }
        return ouput.toString();
    }
}
