package C_5;

public class C_5_4 {

    public static void main(String[] args) {

        C_5_4 c54 = new C_5_4();
        c54.c54_Method();

    }

    public  void c54_Method() {

        System.out.printf("%-10s%8s%n", "英里", "千米");

        for (int i = 1; i < 200; i++) {
            System.out.printf("%-10s       %.3f%n", i, i * 1.609);
        }
    }
}
