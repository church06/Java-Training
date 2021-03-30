package C_3;

import java.util.Scanner;

public class C_3_11 {


    public static void main(String[] args) {

        C_3_11 c311 = new C_3_11();

        Scanner sc = new Scanner(System.in);
        System.out.println("输入年份：");
        int year = sc.nextInt();
        System.out.println("输入月份：");
        int month = sc.nextInt();

        months months = c311.monthTransfer(month);
        int days = 0;

        if (month == 2) {
            days = c311.specialFeb(year);
        } else {
            days = c311.monthMatchdays(month);
        }

        System.out.println("在 " + year + "中，" + months + " 拥有 " + days + "天。");

    }

    enum months {
        JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
    }

    private months monthTransfer(int input) {
        months months;

        switch (input) {
            case 2:
                months = C_3_11.months.FEB;
                break;
            case 3:
                months = C_3_11.months.MAR;
                break;
            case 4:
                months = C_3_11.months.APR;
                break;
            case 5:
                months = C_3_11.months.MAY;
                break;
            case 6:
                months = C_3_11.months.JUN;
                break;
            case 7:
                months = C_3_11.months.JUL;
                break;
            case 8:
                months = C_3_11.months.AUG;
                break;
            case 9:
                months = C_3_11.months.SEP;
                break;
            case 10:
                months = C_3_11.months.OCT;
                break;
            case 11:
                months = C_3_11.months.NOV;
                break;
            case 12:
                months = C_3_11.months.DEC;
                break;
            default:
                months = C_3_11.months.JAN;
        }

        return months;
    }

    private int monthMatchdays(int input) {
        int days = 0;
        switch (input) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
        }
        return days;
    }

    private int specialFeb(int year) {
        int days = 0;
        if (year % 4 == 0) {
            days = 29;
        } else {
            days = 28;
        }
        return days;
    }
}
