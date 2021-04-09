package C_5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class C_5_34 {
    enum Contents {ROCK, PAPER, SCISSORS}

    public static void main(String[] args) {
        int counter = 0;

        while (true) {
            System.out.print("输入数字猜拳\n0 - ROCK, 1 - PAPER, 2 - SCISSORS: ");

            try {
                String user_s = new Scanner(System.in).nextLine();
                if (user_s.equalsIgnoreCase("n")) {
                    break;
                }

                int user = Integer.parseInt(user_s);

                if (user >= 3) {
                    System.out.println("输入错误");
                    continue;
                }

                int result = Game(user);

                if (result == 0) {
                    System.out.println("平局 得分: " + counter + "\n");

                } else if (result == 1) {
                    if (counter > 0) {
                        counter -= 1;
                    }
                    System.out.println("失败 得分: " + counter + "\n");

                } else if (result == 2) {
                    counter++;
                    System.out.println("胜利 得分: " + counter + "\n");

                }

                if (counter >= 2) {
                    System.out.println("电脑失败，玩家胜利");
                    break;
                }

            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("输入错误");
            }
        }
        System.out.println("程序结束");
    }

    private static int Game(int user) {

        Random r = new Random();

        int computer = r.nextInt(3);

        Contents user_content = Transfer(user);
        Contents computer_content = Transfer(computer);

        if (computer == user) {
            System.out.println(" 玩家 vs 电脑");
            System.out.println(user_content + " vs " + computer_content);
            return 0;

        } else if (computer < user) {
            System.out.println(" 玩家 vs 电脑");
            System.out.println(user_content + " vs " + computer_content);
            return 2;

        } else if (computer == 2 && user == 0) {
            System.out.println(" 玩家 vs 电脑");
            System.out.println(user_content + " vs " + computer_content);
            return 2;

        } else {
            System.out.println(" 玩家 vs 电脑");
            System.out.println(user_content + " vs " + computer_content);
            return 1;
        }
    }

    private static Contents Transfer(int index) {
        switch (index) {
            case 0:
                return Contents.ROCK;
            case 1:
                return Contents.PAPER;
            default:
                return Contents.SCISSORS;
        }
    }
}
