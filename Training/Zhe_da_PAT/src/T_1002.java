import java.util.ArrayList;
import java.util.Scanner;

public class T_1002 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        T_1002 one = new T_1002();
        pinyin(one.jia(input));

    }

    public int jia(String target) {
        int result = 0;
        for (int i = 0; i < target.length(); i++) {
            result += Integer.parseInt(String.valueOf(target.charAt(i)));
        }

        return result;
    }

    public static void pinyin(int target) {
        String tsf = String.valueOf(target);
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < tsf.length(); i++) {
            switch (tsf.charAt(i)) {
                case '1':
                    list.add("yi");
                    break;
                case '2':
                    list.add("er");
                    break;
                case '3':
                    list.add("san");
                    break;
                case '4':
                    list.add("si");
                    break;
                case '5':
                    list.add("wu");
                    break;
                case '6':
                    list.add("liu");
                    break;
                case '7':
                    list.add("qi");
                    break;
                case '8':
                    list.add("ba");
                    break;
                case '9':
                    list.add("jiu");
                    break;
                default:
                    list.add("ling");

            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (i != list.size() - 1) {
                System.out.print(list.get(i) + " ");
            } else {
                System.out.print(list.get(i));
                System.out.println();
            }
        }
    }
}
