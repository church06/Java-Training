package C_5;

public class C_5_7 {

    public static void main(String[] args) {

        C_5_7 c57 = new C_5_7();
        c57.c57_Method();

    }

    public void c57_Method() {

        int found = 10000;
        int found_fu_4 = 0;

        for (int i = 0; i < 14; i++) {
            found *= 1.05;
            System.out.println(found);

            if (i >= 10) {
                found_fu_4 += found;
            }
        }

        System.out.println(found_fu_4);
    }
}
