package C_2;

import java.util.ArrayList;
import java.util.Scanner;

public class C_2_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数：");
        int num = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        String tsf = String.valueOf(num);

        int lenth = tsf.length();

        for (int i = 0; i < lenth; i++) {
            int nm = Integer.parseInt(tsf.charAt(i)+"");
            list.add(nm);
        }

        int total = 0;
        for (int i : list) {
            total += i;
        }

        System.out.println(total);
    }
}
