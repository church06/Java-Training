package C_2;

public class C_2_18 {

    public static void main(String[] args) {
        System.out.println("a   b   pow(a, b)");
        int a = 1;
        int b = 2;
        for (int i = 0; i < 5; i++) {
            System.out.println(a + "   " + b +"   " + (int)Math.pow(a, b));
            ++a;
            ++b;
        }
    }
}
