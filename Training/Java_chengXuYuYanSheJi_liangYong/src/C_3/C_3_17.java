package C_3;

import java.util.Random;
import java.util.Scanner;

public class C_3_17 {

    public static void main(String[] args) {
        C_3_17 c317 = new C_3_17();
        Random r = new Random();

        Scanner sc = new Scanner(System.in);

        System.out.println("输入0, 1, 2进行猜拳(M退出)：");

        int computer = r.nextInt(3);
        String input = sc.nextLine();

        while (!input.equals("M")) {
            try {
                if (Integer.parseInt(input) > 2) {
                    System.out.println("?????");
                    input = sc.nextLine();
                } else {
                    c317.GameBattle(Integer.parseInt(input), computer);
                    computer = r.nextInt(3);
                    input = sc.nextLine();
                }

            } catch (NumberFormatException e) {
                System.out.println("??????");
                input = sc.nextLine();
            }
        }

        System.out.println("游戏结束，退出运行。");


    }

    enum GameContents {
        ROCK, PAPER, SCISSORS
    }

    private GameContents GameImpl(int input) {
        GameContents contents = null;
        switch (input) {
            case 0:
                contents = GameContents.ROCK;
                break;
            case 1:
                contents = GameContents.PAPER;
                break;
            case 2:
                contents = GameContents.SCISSORS;
        }
        return contents;
    }

    private void GameBattle (int input, int computer) {
        if (input == 0 && computer == 2) {
            System.out.println(GameImpl(input).toString() + " " + GameImpl(computer).toString() + " win");

        } else if (input == 3 && computer == 0) {
            System.out.println(GameImpl(input).toString() + " " + GameImpl(computer).toString() + " fail");

        } else if (input > computer) {
            System.out.println(GameImpl(input).toString() + " " + GameImpl(computer).toString() + " win");

        } else if (computer > input) {
            System.out.println(GameImpl(input).toString() + " " + GameImpl(computer).toString() + " fail");

        } else {
            System.out.println(GameImpl(input).toString() + " = " + GameImpl(computer).toString());
        }
    }
}