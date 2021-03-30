package C_3;

import java.util.Scanner;

public class C_3_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        double tax;

        if (salary <= 8350.0) {
            tax = salary * 0.1;
        } else if (salary > 8350.0 && salary <= 33950.0) {
            tax = 835 + (salary - 8350) * 0.15;

        } else if (salary > 33950.0 && salary <= 82250) {
            tax = 835 + (salary - 8350) * 0.15 +
                    (salary - 33950) * 0.25;

        } else if (salary > 82250 && salary <= 171550) {
            tax = 835 + (salary - 8350) * 0.15 +
                    (salary - 33950) * 0.25 +
                    (salary - 82250) * 0.28;

        } else if (salary > 171550 && salary <= 372950) {
            tax = 835 + (salary - 8350) * 0.15 +
                    (salary - 33950) * 0.25 +
                    (salary - 82250) * 0.28 +
                    (salary - 171550) * 0.33;

        } else {
            tax = 835 + (salary - 8350) * 0.15 +
                    (salary - 33950) * 0.25 +
                    (salary - 82250) * 0.28 +
                    (salary - 171550) * 0.33 +
                    (salary - 372950) * 0.35;
        }

        System.out.println(tax);
    }
}
