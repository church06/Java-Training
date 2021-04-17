package C_6;

public class C_6_12 {

    public static void main(String[] args) {
        C612_method();
    }

    public static void C612_method() {
        printChars('1', 'Z', 10);
    }

    public static void printChars(char ch1, char ch2, int numberPerLine) {

        int start = ch1 + 1;
        int counter = 0;

        for (int i = start; i < (int) ch2; i++) {
            System.out.print((char) i);
            counter++;
            if (counter == numberPerLine) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
