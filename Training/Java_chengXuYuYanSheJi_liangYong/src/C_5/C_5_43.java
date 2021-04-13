package C_5;

public class C_5_43 {

    public static void main(String[] args) {
        System.out.println(C543_method(7));
    }

    public static int C543_method(int num) {
        int counter = 0;

        if (num == 1) {
            counter += Factorial(1, num);
            return counter;

        } else {
            counter += Factorial(num - 1, num);
            return counter + C543_method(num - 1);
        }
    }

    private static int Factorial(int num, int total) {
        int counter = 0;

        if (num <= 1 && total != 1) {
            counter++;
            System.out.println(num + " " + total);
            return counter;

        } else if (total == num) {
            return 0;

        } else {
            counter++;
            System.out.println(num + " " + total);
            return counter + Factorial(num - 1, total);
        }
    }
}
