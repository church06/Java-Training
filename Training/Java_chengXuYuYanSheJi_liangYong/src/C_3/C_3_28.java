package C_3;

import java.util.ArrayList;
import java.util.Scanner;

public class C_3_28 {

    public static void main(String[] args) {
        C_3_28 c328 = new C_3_28();
        Scanner sc = new Scanner(System.in);

        System.out.println("输入矩形1中心点(x, y)和宽，高：");

        String input1 = sc.nextLine();
        String[] pointStr_1 = input1.split(" ");

        System.out.println("输入矩形2中心点(x, y)和宽，高：");

        String input2 = sc.nextLine();
        String[] pointStr_2 = input2.split(" ");

        while (!input1.equals("exit") || !input2.equals("exit")) {

            ArrayList<Double> square_1 = new ArrayList<>();
            ArrayList<Double> square_2 = new ArrayList<>();

            try {
                for (String i : pointStr_1) {
                    square_1.add(Double.parseDouble(i));
                }

                for (String i : pointStr_2) {
                    square_2.add(Double.parseDouble(i));
                }

                int detect = c328.Detect(square_1, square_2);
                square_1.clear();
                square_2.clear();

                switch (detect) {
                    case 0:
                        System.out.println("w1, w2相交。");
                        break;
                    case 1:
                        System.out.println("w1内涵w2。");
                        break;
                    case -1:
                        System.out.println("w1, w2相离。");
                }

                System.out.println("输入矩形1中心点(x, y)和宽，高：");
                input1 = sc.nextLine();
                pointStr_1 = input1.split(" ");
                System.out.println("输入矩形2中心点(x, y)和宽，高：");
                input2 = sc.nextLine();
                pointStr_2 = input2.split(" ");

            } catch (NumberFormatException e) {
                System.out.println("???");
                input1 = sc.nextLine();
                pointStr_1 = input1.split(" ");
                input2 = sc.nextLine();
                pointStr_2 = input2.split(" ");
            }
        }
    }

    private int Detect(ArrayList<Double> input1, ArrayList<Double> input2) {

        int detect = 0;

        double x1 = input1.get(0);
        double y1 = input1.get(1);
        double wide1 = input1.get(2) / 2;
        double height1 = input1.get(3) / 2;

        double x2 = input2.get(0);
        double y2 = input2.get(1);
        double wide2 = input2.get(2) / 2;
        double height2 = input2.get(3) / 2;

        double up1 = y1 + height1;
        double down1 = y1 - height1;
        double left1 = x1 - wide1;
        double right1 = x1 + wide1;

        double up2 = y2 + height2;
        double down2 = y2 - height2;
        double left2 = x2 - wide2;
        double right2 = x2 + wide2;

        boolean inside2_1 = left2 >= left1 && right2 <= right1 && up2 <= up1 && down2 >= down1;

        if (up2 <= down1 || down2 >= up1 || right2 <= left1 || left2 >= right1) {
            detect = -1;
            return detect;
        } else if (inside2_1) {
            detect = 1;
            return detect;
        } else {
            return detect;
        }
    }
}
