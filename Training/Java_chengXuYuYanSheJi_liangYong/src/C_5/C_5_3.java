package C_5;

public class C_5_3 {

    public static void main(String[] args) {

        C_5_3 c53 = new C_5_3();
        c53.c53_Method();

    }

    public void c53_Method() {
        System.out.printf("%-10s%8s%n", "千克", "磅");

        for (int i = 1; i < 200; i++) {
            System.out.printf("%-10s%10.1f%n", i, i * 2.2);
        }
    }
}
