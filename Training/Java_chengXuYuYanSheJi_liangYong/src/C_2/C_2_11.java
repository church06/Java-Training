package C_2;

import java.util.Scanner;

public class C_2_11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入年数：");
        int year = sc.nextInt();
        int time = 3600 * 24 * 365 * (year);
        int population = 312032486;
        int born = 7;
        int death = 13;
        int migrate = 45;

        int bornTotal = time /7;
        int deathTotal = time / 13;
        int migrateTotal = time / 45;

        int population_2 = population - deathTotal + bornTotal + migrateTotal;

        System.out.println(population_2);
    }
}
