package C_5;

public class C_5_24 {

    public static void main(String[] args) {

        double output = 0.0;

        for (int i = 1; i < 100; ) {
            int numerator = i;
            i += 2;
            output += (double) numerator / i;
        }

        System.out.println(output);
    }
}
