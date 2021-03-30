package C_2;

import java.util.Date;
import java.util.Scanner;

public class C_2_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入时间(Hour)：");
        int input = sc.nextInt();

        long current_sec = System.currentTimeMillis();

        long total_sec = current_sec / 1000;

        long sec = total_sec % 60;

        long min = (total_sec / 60) % 60;

        long hour = (total_sec / 3600) % 24;

        System.out.println("时间为：" + (hour + input) + " : " + min + " : " + sec);


        Date date = new Date();
        System.out.println(date);
    }
}
