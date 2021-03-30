package C_1;

public class C_1_4 {

    public static void main(String[] args) {
        System.out.println("a   a^2   a^3");
        for (int i = 1; i < 5; i++) {
            int square = (int) Math.pow(i, 2);
            int cube = (int) Math.pow(i, 3);
            int length = String.valueOf(square).length();
            System.out.println(i + "   " + square + " ".repeat(4 - length + 2) + cube);
        }
    }
}
