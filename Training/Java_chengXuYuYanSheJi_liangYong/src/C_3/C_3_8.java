package C_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class C_3_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入三个数：");
        String input = sc.nextLine().trim();
        String[] list = input.split("");

        try {
            ArrayList<Double> user_list = new ArrayList<>();
            ArrayList<Double> convert = new ArrayList<>();

            for (String i : list) {
                double num = Double.parseDouble(i);
                user_list.add(num);
            }
            Collections.sort(user_list);

            for (int i = user_list.size() - 1; i >= 0; i--) {
                convert.add(user_list.get(i));
            }

            System.out.println(convert);

        } catch (NumberFormatException e) {
            System.out.println("?????????????\nError.");
        }

    }
}
