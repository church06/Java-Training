package C_5;

public class C_5_11 {

    public static void main(String[] args) {
        for (int i = 100; i < 1001; i++) {

            if (!(i % 5 == 0 && i % 6 == 0)) {
                if (i % 5 == 0) {
                    System.out.println(i);
                } else if (i % 6 == 0){
                    System.out.println(i);
                }
            }
        }
    }
}
