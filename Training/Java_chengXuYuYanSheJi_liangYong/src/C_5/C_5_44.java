package C_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C_5_44 {

    public static void main(String[] args) {
        C544_method();
    }

    public static void C544_method() {

        while (true) {
            System.out.print("输入短整型: ");

            try {
                short input = new Scanner(System.in).nextShort();
                StringBuffer convert = new StringBuffer();
                if (input >= 0) {
                    System.out.printf("0%015d", Integer.parseInt(C_5_37.to_Base(input, 2)));

                } else {
                    String result = String.format("0%015d", Integer.parseInt(C_5_37.to_Base(-input, 2)));

                    for (int i = 0; i < result.length() - 1; i++) {
                        if (result.charAt(i) == '0') {
                            convert.append(1);
                        } else {
                            convert.append(0);
                        }
                    }
                }
                convert.append(1);
                System.out.println(convert);

            } catch (InputMismatchException e) {
                System.out.println("输入错误");
            }
        }

    }
}
