package C_4;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class C_4_18 {

    public static void main(String[] args) {

        C_4_18 c418 = new C_4_18();
        c418.c418_method();

    }

    public void c418_method() {
        Map<String, String> major = Map.of("M", "数学", "C", "计算机科学", "I", "信息技术");
        Map<Integer, String> level = Map.of(1, "大一", 2, "大二", 3, "大三", 4, "大四");

        while (true) {
            System.out.println("输入指令进行查询");
            String input = new Scanner(System.in).nextLine().trim().toUpperCase(Locale.ROOT);
            String[] code = input.split("");

            if (input.equals("EXIT")) {
                break;
            }

            // =======================================
            if (code.length > 2) {
                System.out.println("输入错误");

            } else {
                int grade_Num = detect(code);
                String course_temp = code[0];

                String grade = level.getOrDefault(grade_Num, null);
                String course = major.getOrDefault(course_temp, null);

                if (grade == null || course == null) {
                    System.out.println("输入错误");
                } else {
                    System.out.printf("%s %s%n", grade, course);
                }


            }
            // ======================================

        }

        System.out.println("程序结束");
    }

    public int detect(String[] code) {
        int output;

        while (true) {
            try {
                output = Integer.parseInt(code[1]);
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入错误");
                code = new Scanner(System.in).nextLine().trim().split("");
            }
        }

        return output;
    }
}
