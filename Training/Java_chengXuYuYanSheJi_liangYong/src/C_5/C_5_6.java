package C_5;

public class C_5_6 {

    public static void main(String[] args) {

        C_5_6 c56 = new C_5_6();
        c56.c56_Method();

    }

    public void c56_Method() {
        System.out.printf("%-5s%-9s%-5s%-5s%n", "英里", "千米", "千米", "英里");

        for (int i = 1; i < 11; i++) {
            System.out.printf("% -6d%-11.3f%-5d%-5.3f%n", i, i * 1.609, i * 5 + 15, ((i * 5 + 15) / 1.609));
        }
    }
}
