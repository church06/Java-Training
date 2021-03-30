package C_5;

public class C_5_5 {

    public static void main(String[] args) {

        C_5_5 c55 = new C_5_5();
        c55.c55_Method();

    }

    public void c55_Method() {
        System.out.printf("%-5s%-10s%-5s%-5s%n", "千克", "磅", "磅", "千克");

        for (int i = 1; i < 200; i++) {
            if (i < 100) {
                System.out.printf("%-6d%-11.2f%-5d%-5.2f%n", i, i * 2.2, i * 5 + 20, ((i * 5 + 20) / 2.2));
            } else {
                System.out.printf("%-6d%-10.2f%n", i, i * 2.2);
            }
        }
    }
}
