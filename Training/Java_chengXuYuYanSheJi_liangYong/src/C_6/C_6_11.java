package C_6;

import C_5.C_5_39;

public class C_6_11 {

    public static void main(String[] args) {
        C611_method();
    }

    public static void C611_method() {

        for (int i = 10000; i <= 100000; i+= 5000) {
            System.out.println(computeCommission(i));
        }
    }

    public static double computeCommission(double salesAmount) {
        return Double.parseDouble(C_5_39.Salary(salesAmount).toString());
    }
}
