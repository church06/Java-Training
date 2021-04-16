package C_6;

import java.util.Arrays;

public class C_6_5 {

    public static void main(String[] args) {
        C65_method();
    }

    public static void C65_method() {
        displaySortedNumbers(5,4,9);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {

        double[] list = {num1, num2, num3};
        System.out.println(Arrays.toString(list));

        int counter;

        do {
            counter = 0;

            for (int i = 1; i < list.length; i++) {

                if (list[i] < list[i - 1]) {

                    counter++;
                    double num = list[i];

                    list[i] = list[i - 1];
                    list[i - 1] = num;

                }
            }
        } while (counter != 0);

        System.out.println(Arrays.toString(list));
    }
}
