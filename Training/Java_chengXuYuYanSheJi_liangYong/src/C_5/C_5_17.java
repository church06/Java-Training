package C_5;

public class C_5_17 {

    public static void main(String[] args) {
        int num = 7;

        C_5_17.c517Method(num);
        System.out.println();
        C_5_17.c517Method_2(num);

    }

    private static void c517Method(int num) {
        for (int i = 1; i < num + 1; i++) {

            StringBuffer list = new StringBuffer();
            int temp = i;

            while (temp >= 1) {
                list.append(temp).append(" ");
                temp--;
            }

            while (temp != i) {

                temp++;
                if (temp >= 2) {
                    if (temp == i) {
                        list.append(temp);
                    } else {
                        list.append(temp).append(" ");
                    }

                }

            }
            System.out.println(" ".repeat(14 - i * 2) + list);
        }
    }

    private static void c517Method_2(int num) {

        for (int i = 1; i < num + 1; i++) {

            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    System.out.print(" ".repeat(14 - i * 2));
                } else {
                    System.out.print(i - j + 1 + " ");
                }

            }
            for (int k = 0; k <= i; k++) {
                if (k > 1) {
                    System.out.print(k + " ");
                }

            }
            System.out.println();
        }
    }
}
