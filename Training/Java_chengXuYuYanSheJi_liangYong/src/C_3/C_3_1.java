package C_3;

import java.util.ArrayList;
import java.util.Scanner;

public class C_3_1 {

    double a = 0;
    double b = 0;
    double c = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] elements = input.split(" ");

        C_3_1 c3 = new C_3_1();


        if (elements.length > 3) {
            System.out.println("Error.");
        } else {

            c3.setA(Double.parseDouble(elements[0]));
            c3.setB(Double.parseDouble(elements[1]));
            c3.setC(Double.parseDouble(elements[2]));
        }
        int gen = c3.erYuanPanBieShi(c3.getA(), c3.getB(), c3.getC());

        ArrayList<Double> results = c3.gen_Compute(gen);

        if (results.size() == 0) {
            System.out.println("无实根。");
        } else if (results.size() == 1) {
            System.out.println("有 1x 根：" + results.get(0));
        } else {
            System.out.println("有 2x 根：" + results.get(0) + " 和 " + results.get(1));
        }
    }

// ============================================================================

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

// ===========================================================================

    private int erYuanPanBieShi(double a, double b, double c) {
        int gen = 0;

        double result = Math.pow(b, 2) - 4 * a * c;

        if (result > 0) {
            gen = 2;
        } else if (result == 0) {
            gen = 1;
        }

        return gen;
    }

    private ArrayList<Double> gen_Compute(int gen) {

        ArrayList<Double> output = new ArrayList<>();

        double result_a;
        double result_b;

        switch (gen) {
            case 2:
                result_a = (-b + Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5)) / 2 * a;
                result_b = (-b + Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5)) / 2 * a;
                output.add(result_a);
                output.add(result_b);
                break;

            case 1:
                result_a = (-b + Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5)) / 2 * a;
                output.add(result_a);
                break;

            default:
                break;
        }

            return output;
    }
}
