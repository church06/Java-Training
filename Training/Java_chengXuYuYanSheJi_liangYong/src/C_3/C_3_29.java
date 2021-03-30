package C_3;

import java.util.ArrayList;
import java.util.Scanner;

public class C_3_29 {

    public static void main(String[] args) {
        C_3_29 c229 = new C_3_29();
        Scanner sc = new Scanner(System.in);

        System.out.println("输入圆c1的圆心坐标(x, y)和半径：");
        String input1 = sc.nextLine();
        System.out.println("输入圆c2的圆心坐标(x, y)和半径：");
        String input2 = sc.nextLine();

        while (!input1.equals("exit") || !input2.equals("exit")) {

            try {

                String[] inputStr_1 = input1.split(" ");
                String[] inputStr_2 = input2.split(" ");

                if (inputStr_1.length != 3 || inputStr_2.length != 3) {

                    System.out.println("格式存在错误，请重新输入。");

                } else {

                    ArrayList<Double> c1 = c229.addAll(inputStr_1);
                    ArrayList<Double> c2 = c229.addAll(inputStr_2);

                    switch (c229.Detect(c1, c2)) {
                        case -1:
                            System.out.println("c2在c1内。");
                            break;
                        case 0:
                            System.out.println("c2，c1内切。");
                            break;
                        case 1:
                            System.out.println("c2，c1重叠。");
                            break;
                        case 2:
                            System.out.println("c2，c1外切。");
                            break;
                        case 3:
                            System.out.println("c2，c1相离。");
                    }
                }

                System.out.println("输入圆c1的圆心坐标(x, y)和半径：");
                input1 = sc.nextLine();
                System.out.println("输入圆c2的圆心坐标(x, y)和半径：");
                input2 = sc.nextLine();

            } catch (NumberFormatException e) {
                System.out.println("???");
                input1 = sc.nextLine();
                input2 = sc.nextLine();
            }
        }
    }

    private ArrayList<Double> addAll(String[] input) {
        ArrayList<Double> output = new ArrayList<>();

        for (String i : input) {
            output.add(Double.parseDouble(i));
        }
        return output;
    }

    private int Detect(ArrayList<Double> input_1, ArrayList<Double> input_2) {
        double x1 = input_1.get(0);
        double y1 = input_1.get(1);
        double r1 = input_1.get(2);

        double x2 = input_2.get(0);
        double y2 = input_2.get(1);
        double r2 = input_2.get(2);

        double distance = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);

        if (distance < Math.abs(r1 - r2)) {
            return -1;
        } else if (distance == r1 - r2) {
            return 0;
        } else if (distance < Math.abs(r1 + r2)){
            return 1;
        } else if (distance == r1 + r2){
            return 2;
        } else {
            return 3;
        }
    }
}
