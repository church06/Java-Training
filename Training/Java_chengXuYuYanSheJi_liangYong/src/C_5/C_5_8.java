package C_5;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class C_5_8 {

    public static void main(String[] args) {

        C_5_8 c58 = new C_5_8();
        while (true) {
            c58.c58_Method();
            System.out.println("任意键继续 - n/N 退出:");
            String input = new Scanner(System.in).nextLine();

            if (input.toLowerCase(Locale.ROOT).equals("n")) {
                break;
            }
        }
        System.out.println("程序结束");

    }

    private double score = 0;

    public void c58_Method() {

        int students = studentNumInput();
        Object[] table = name_scoreInput(students);

        int counter = 0;

        while (counter <= 1) {
            if (counter == 1) {
                score = secondReturn(table);
            } else {
                score = firstReturn(table);
            }
            counter++;
            System.out.println(score);
        }

    }

    private int studentNumInput() {

        int output;
        while (true) {
            System.out.print("输入学生的个数：");
            try {
                output = new Scanner(System.in).nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("输入错误");
            }
        }

        return output;
    }

    private Object[] name_scoreInput(int num) {

        Object[] output = new Object[num * 2];
        int j = 0;

        while (true) {
            System.out.println(Arrays.toString(output));

            System.out.println("输入姓名和分数 (空格分割, n 为结束)：");
            String input = new Scanner(System.in).nextLine();

            if (input.toLowerCase(Locale.ROOT).equals("n")) {
                break;
            } else {
                int len = input.split(" ").length;
                if (len != 2) {
                    System.out.println("格式错误");
                    continue;
                }
            }

            int counter;
            int counter_pre = 1;

            for (String i : input.split(" ")) {
                counter = formatDetect(i);

                if (counter_pre == counter) {
                    System.out.println("格式错误");
                    break;
                } else {
                    counter_pre = counter;
                }

                try {
                    String tempStr = (String) output[j];
                    addFunction(counter, j, output, i);

                    if (tempStr != null && !tempStr.equals(output[j])) {
                        System.out.print("数据位置[" + j + "]");
                    }

                } catch (ArrayIndexOutOfBoundsException e) {
                    j = 0;
                    addFunction(counter, j, output, i);
                    System.out.println("数据位置[" + j + "] [" + (j + 1) + "] 已被覆盖");

                } catch (ClassCastException e) {
                    double tempStr = (double) output[j];
                    addFunction(counter, j, output, i);
                    if (tempStr != (double) output[j]) {
                        System.out.println("[" + j + "] 已被覆盖");
                    }
                }
                j++;

            }
        }
        return output;
    }

    private int formatDetect(String input) {

        int counter;

        try {
            Double.parseDouble(input);
            counter = 1;
        } catch (NumberFormatException e) {
            counter = 0;
        }

        return counter;
    }

    private void addFunction(int counter, int j, Object[] output, String i) {

        if (counter == 1) {
            output[j] = Double.parseDouble(i);
        } else {
            output[j] = i;
        }
    }

    private double firstReturn(Object[] table) {
        score = 0;
        for (Object i : table) {
            try {
                if ((double) i >= score) {
                    score = (double) i;

                }
            } catch (NumberFormatException | ClassCastException ignored) {
            } catch (NullPointerException e) {
                System.out.println("未输入");
                break;
            }
        }
        return score;
    }

    private double secondReturn(Object[] table) {

        double bias = 101;
        double score_temp = score;
        for (Object j : table) {
            try {
                if (score_temp - (double) j <= bias && bias != 0) {
                    score = (double) j;
                }
                bias = score - (double) j;
            } catch (ClassCastException ignored) {
            }
        }

        return score;
    }
}
