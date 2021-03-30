package Tools;

import java.util.Arrays;

public class matrixShow {

    private static Object[][] matrix;
    private static int x;
    private static int y;

    public static Object[][] getMatrix() {
        return matrix;
    }

    public static void setMatrix(int x, int y) {
        matrix = new Object[x][y];
        matrixShow.x = x;
        matrixShow.y = y;
    }


    public static void show() {
        // change to another line when reach the end of each line
        for (int y = 0; y < matrixShow.y; y++) {

            /*
             * for each number in matrix, detect if it is the last number
             * then will change, or it won't change.
             * */


            for (int x = 0; x < matrixShow.x; x++) {
                Object[] temp = (Object[]) matrix[x][y];
                if (x == matrixShow.x - 1) {
                    System.out.print(Arrays.toString(temp));
                } else {
                    System.out.print(Arrays.toString(temp) + " ");
                }

            }
            System.out.println();
        }
    }
}
