package C_5;

public class C_5_19 {

    public static void main(String[] args) {

        C_5_19.c519Method(7);

    }

    private static void c519Method(int num) {
        int temp = num;
        while (num >= 0) {

            String output = Output(temp - num, temp);
            System.out.println(output);
            num--;
        }

    }

    private static String Output(int num, int max) {

        StringBuilder output = new StringBuilder();
        output.append("    ".repeat(max - num));

        for (int i = 0; i < num + 1; i++) {
            output.append(String.format("%4d", (int) Math.pow(2, i)));
        }

        for (int i = num - 1; i >=0; i--) {
            output.append(String.format("%4d", (int) Math.pow(2, i)));
        }

        return output.toString();
    }
}
