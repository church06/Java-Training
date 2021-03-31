package C_5;

public class C_5_23 {
    public static void main(String[] args) {
        System.out.println(ConvertComputation(50000));
    }

    public static double ConvertComputation(int n) {

        double output = 0;
        for (int i = n; i > 0; i--) {
            output += (double) 1 / n;
        }

        return output;
    }
}
