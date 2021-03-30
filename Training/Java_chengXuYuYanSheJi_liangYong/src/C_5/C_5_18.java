package C_5;

public class C_5_18 {

    public static void main(String[] args) {

        C_5_18.Op_Output_Convert();
        System.out.println();

        C_5_18.Ne_Output_Convert();

    }

    private static void Op_Output() {
        for (int i = 1; i < 7; i++) {
            int temp = 1;
            while (temp <= i) {
                System.out.print(temp + " ");
                temp++;
            }
            System.out.println();
        }
    }

    private static void Ne_Output() {
        for (int i = 6; i >=1; i--) {
            int temp = i;
            while (temp >= 1) {
                System.out.print(temp + " ");
                temp--;
            }
            System.out.println();
        }
    }

    private static void Op_Output_Convert() {
        for (int i = 1; i < 7; i++) {
            int temp = 1;
            StringBuffer list = new StringBuffer();

            while (temp <= i) {
                list.append(temp).append(" ");
                temp++;
            }
            System.out.printf("%12s", list);
            System.out.println();
        }
    }

    private static void Ne_Output_Convert() {
        for (int i = 6; i >=1; i--) {
            int temp = i;
            StringBuilder output = new StringBuilder();
            while (temp >= 1) {
                output.append(temp).append(" ");
                temp--;
            }
            System.out.printf("%12s", output);
            System.out.println();
        }
    }
}
