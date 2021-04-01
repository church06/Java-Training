package C_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class C_5_29 {

    public static void main(String[] args) {

        while (true) {
            try {
                System.out.print("输入年份和星期\n(Sun - 0, Mon - 1, ..., Sat - 6)\n(n - 退出)\n[Year, begin day]: ");
                String input = new Scanner(System.in).nextLine();

                if (input.equalsIgnoreCase("n")) {
                    break;
                }

                String[] aim = input.split(" ");

                // Variables --------------------------------------------------------
                String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
                int year = Integer.parseInt(aim[0]);
                int day = Integer.parseInt(aim[1]);
                ArrayList<String> list = new ArrayList<>();
                // ------------------------------------------------------------------

                Calendar calendar = Calendar.getInstance();

                for (int i = 0; i < 12; i++) {
                    calendar.set(Calendar.YEAR, year);
                    calendar.set(Calendar.DATE, 1);
                    calendar.set(Calendar.MONTH, i);

                    int week = calendar.get(Calendar.DAY_OF_WEEK);
                    list.add(days[week - 1]);
                }

                ArrayList<StringBuilder> prints = Days_output(list, days, year);
                calendar_show(prints, day);

            } catch (NumberFormatException e) {
                System.out.println("输入错误");
            }
        }
        System.out.println("程序结束");
    }

    public static ArrayList<StringBuilder> Days_output(ArrayList<String> list_1, String[] list_2, int year) {

        ArrayList<StringBuilder> output = new ArrayList<>();

        ArrayList<String> days = new ArrayList<>(Arrays.asList(list_2));
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int counter = 0;
        for (String i : list_1) {
            StringBuilder calendar = new StringBuilder();
            calendar.append(String.format("              %s%s              %n", months[counter], year));
            calendar.append("---------------------------------\n");
            calendar.append(String.format("%s  %s  %s  %s  %s  %s  %s%n",
                    days.get(0), days.get(1), days.get(2), days.get(3), days.get(4), days.get(5), days.get(6)));

            int index = days.indexOf(i);

            if (counter == 1) {
                calendar.append(day_show(index, 28));
            } else if (counter == 0 || counter == 2 || counter == 5 || counter == 6 ||
                    counter == 7 || counter == 9 || counter == 11) {

                calendar.append(day_show(index, 31));
            } else {
                calendar.append(day_show(index, 30));
            }

            counter++;
            output.add(calendar);
        }
        return output;
    }

    public static StringBuilder day_show(int index, int days_in_month) {

        String[] line = {"", "", "", "", "", "", ""};
        StringBuilder output = new StringBuilder();

        for (int i = 1; i <= days_in_month; i++) {

            if (index == 6) {
                line[index] = Integer.toString(i);
                output.append(String.format("%3s  %3s  %3s  %3s  %3s  %3s  %3s%n",
                        line[0], line[1], line[2], line[3], line[4], line[5], line[6]));
                line = new String[]{"", "", "", "", "", "", ""};
                index = 0;
            } else {
                line[index] = Integer.toString(i);
                index++;
            }
        }

        int is_empty = 0;
        for (String i : line) {
            if (!i.equals("")) {
                is_empty++;
            }
        }

        if (is_empty != 0) {
            output.append(String.format("%3s  %3s  %3s  %3s  %3s  %3s  %3s",
                    line[0], line[1], line[2], line[3], line[4], line[5], line[6]));
        }
        return output;
    }

    public static void calendar_show(ArrayList<StringBuilder> input, int begin_day) {

        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        // 27
        for (StringBuilder i : input) {
            try {
                for (int j = 0; j < i.length(); j++) {

                    String start = days[begin_day];
                    int target = i.indexOf(start);

                    if (i.charAt(37 + target) == '1') {
                        System.out.println(input.get(input.indexOf(i)));
                        break;
                    }
                }
            } catch (Exception ignored) {
            }
        }
    }
}
