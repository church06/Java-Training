package C_3;

import java.util.Date;
import java.util.Scanner;

public class C_3_30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入时间(Hour)：");
        int input = sc.nextInt();

        long current_sec = System.currentTimeMillis();

        long total_sec = current_sec / 1000;

        long sec = total_sec % 60;

        long min = (total_sec / 60) % 60;

        long hour = (total_sec / 3600) % 24;

        long current_hour = hour + input;

        if (current_hour < 0) {
            current_hour += 12;
        } else if (current_hour > 12) {
            current_hour -= 12;
        }

        System.out.println("时间为：" + current_hour + " : " + min + " : " + sec);


        Date date = new Date();
        System.out.println(date);
    }
}
