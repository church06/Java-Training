package C_3;

import java.util.Scanner;

public class C_3_3 {

    double a;
    double b;
    double e;

    double c;
    double d;
    double f;

    String[] slots;

// ================================================================================ PSVM

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        C_3_3 c33 = new C_3_3();

        System.out.println("输入a, b, c, d, e, f：");
        String input = sc.nextLine();
        String[] list = input.split(" ");



        if (c33.wrongInputDevide(list)) {
            c33.slots = list;
            c33.eachNum();

            double x = (c33.e * c33.d - c33.b * c33.f) / (c33.a * c33.d - c33.b * c33.c);
            double y = (c33.a * c33.f - c33.e * c33.c) / (c33.a * c33.d - c33.b * c33.c);
            if (c33.a * c33.d - c33.b * c33.c == 0) {
                System.out.println("该方程无解。");
            } else {
                System.out.println("x: " + x);
                System.out.println("y: " + y);
            }

        } else {
            System.out.println("输入错误");
        }

    }
// ================================================================================ Methods

    public boolean wrongInputDevide(String[] input) {
        boolean decide = true;

        if (input.length != 6) {
            decide = false;
        } else {
            for (String s : input) {
                try {
                    Double.parseDouble(s);
                } catch (NumberFormatException e) {
                    decide = false;
                }
            }
        }

        return decide;
    }

    public void eachNum() {

        for (int i = 0; i < slots.length; i++) {
            switch (i) {
                case 0:
                    a = Double.parseDouble(slots[i]);
                    break;
                case 1:
                    b = Double.parseDouble(slots[i]);
                    break;
                case 2:
                    c = Double.parseDouble(slots[i]);
                    break;
                case 3:
                    d = Double.parseDouble(slots[i]);
                    break;
                case 4:
                    e = Double.parseDouble(slots[i]);
                    break;
                case 5:
                    f = Double.parseDouble(slots[i]);
                    break;
            }
        }
    }
}
