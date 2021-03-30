package C_3;

import java.util.Scanner;

public class C_3_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入今天的日期：");
        int input = sc.nextInt();
        C_3_5 c35 = new C_3_5();
        System.out.println(c35.getDay(input));
        System.out.println("输入将来的日期：");
        int input_fut = (input + sc.nextInt()) % 7;
        System.out.println(c35.getDay(input_fut));


    }

    enum day {
        Mon, Tue, Wed, Thu, Fri, Sat, Sun
    }

    public day getDay(int input) {
        day date = null;

        switch (input) {
            case 0:
                date = day.Sun;
                break;
            case 1:
                date = day.Mon;
                break;
            case 2:
                date = day.Tue;
                break;
            case 3:
                date = day.Wed;
                break;
            case 4:
                date = day.Thu;
                break;
            case 5:
                date = day.Fri;
                break;
            case 6:
                date = day.Sat;
                break;
            default:
                System.out.println("Error input.");
                break;
        }

        return date;
    }

}
