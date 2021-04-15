package C_6;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class C_6_3 {

    public static void main(String[] args) {
        C63_method(12321);
    }

    public static void C63_method(int num) {

        System.out.println(reverse(num));
        System.out.println(isPalindrome(num));
    }

    public static int reverse(int num) {

        int output = 0;

        int counter = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = num; i > 0; i /= 10) {

            int bit = i % 10;
            list.add(bit);
            counter++;
        }

        for (int i = counter - 1; i >= 0; i--) {
            output += list.get(0) * Math.pow(10, i);
            list.remove(0);
        }

        return output;
    }

    public static boolean isPalindrome(int num) {
        return reverse(num) == num;
    }
}
