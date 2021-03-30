package C_2;

import java.util.Scanner;

public class C_2_2 {

    public static void main(String[] args) {
        System.out.println("输入圆柱体半径：");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        System.out.println("输入圆柱体高：");
        double high = sc.nextDouble();

        double Area = Math.pow(radius, 2) * Math.PI;
        double volume = Area * high;
        System.out.println("Area: " + Area);
        System.out.println("Volume: " + volume);
        }
    }
