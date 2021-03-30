package C_4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;

public class C_4_24 {

    public static void main(String[] args) {
        System.out.print("City 1: ");
        String city1 = new Scanner(System.in).nextLine();

        System.out.print("City 2: ");
        String city2 = new Scanner(System.in).nextLine();

        System.out.print("City 3: ");
        String city3 = new Scanner(System.in).nextLine();

        int char1 = city1.charAt(0);
        int char2 = city2.charAt(0);
        int char3 = city3.charAt(0);

        Map<Integer, String> map = Map.of(char1, city1, char2, city2, char3, city3);

        ArrayList<Integer> list = new ArrayList<>();

        list.add(char1);
        list.add(char2);
        list.add(char3);

        list.sort(Comparator.naturalOrder());

        for (int i : list) {
            System.out.printf("%s ", map.get(i));
        }
    }
}
