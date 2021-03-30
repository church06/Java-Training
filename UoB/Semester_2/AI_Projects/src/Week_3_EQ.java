import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Week_3_EQ {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("G:\\Entrance\\JavaProgram\\Training_and_UoB\\AI_Projects\\src\\Week_3_EQ_data.txt"));

        ArrayList<Double> data = new ArrayList<>();

        String i;

        while ((i = reader.readLine()) != null) {
            double num = Double.parseDouble(i);
            data.add(num);
        }

        double u = U(data);
        double o = O(data, u);
        double a = 154;

        double result = Week_3_EQ.Gaussian(u, o, a);
        System.out.printf("%.5f", result/25);


    }

    private static double Gaussian(double u, double o, double a) {

        return 1 / Math.pow(2 * o * Math.PI, 0.5) * (Math.pow(Math.E, -(Math.pow(a - u, 2)) / (2 * o)));
    }

    private static double U(ArrayList<Double> input) {
        double output = 0;
        for (double i : input) {
            output += i;
        }

        output /= input.size();
        return output;
    }

    private static double O(ArrayList<Double> input, double u) {
        double output = 0;
        for (double i : input) {
            output += Math.pow(i - u, 2);
        }

        output /= input.size() - 1;
        return output;
    }
}
