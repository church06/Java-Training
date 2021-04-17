package C_6;

import java.util.ArrayList;

public class C_6_10 {

    ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        C610_method();
    }

    public static void C610_method() {

        int counter = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 2; i < 10000; i++) {

            if (isPrime(i)) {
                counter++;
                list.add(i);
            }

        }

        System.out.println(counter);
        System.out.println(list);
    }

    public static boolean isPrime(int num) {

        int counter = 0;

        for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                counter ++;
            }
        }

        if (counter == 0) {
            return true;

        } else {
            return false;
        }
    }
}
