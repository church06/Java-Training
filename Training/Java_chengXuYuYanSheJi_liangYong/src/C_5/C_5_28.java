package C_5;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class C_5_28 {

    public static void main(String[] args) throws ParseException {

        String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        while (true) {
            System.out.print("输入年份: ");
            String input = new Scanner(System.in).nextLine();

            try {
                int year = Integer.parseInt(input);

                if (input.equalsIgnoreCase("n")) {
                    break;
                } else {
                    Calendar calendar = Calendar.getInstance();
                    ArrayList<String> list = new ArrayList<>();

                    for (int i = 0; i < 12; i++) {
                        calendar.set(Calendar.YEAR, year);
                        calendar.set(Calendar.DATE, 1);
                        calendar.set(Calendar.MONTH, i);

                        int day = calendar.get(Calendar.DAY_OF_WEEK);

                        list.add(days[day - 1]);

                        System.out.print(list);
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("输入错误");
            }
        }
        System.out.println("运行结束。");
    }


}
