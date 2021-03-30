import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Week_2_EQ_Q3 {

    public static final String DATA_FILE = "G:\\Entrance\\JavaProgram\\Training_and_UoB\\AI_Projects\\src\\MacdonellDF.csv";
    private static final List<List<Double>> data = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        double w0 = 0;
        double w1 = 0;
        double w2 = 0;
        double alpha = 0.1;
        Week_2_EQ_Q3.dataRead();

        // Train times
        int epoch = 100;
        // Train Loop
        for (int i = 0; i < epoch; i++) {

            ArrayList<Double> boundary = new ArrayList<>();
            double cost = 0;

            // Data Loop
            for (List<Double> j : data) {

                double hwx = Hypofunction(j, w0, w1, w2);
                boundary.add(hwx);

                double t = j.get(2);
                int y = (int) t;
                double x1 = j.get(0);
                double x2 = j.get(1);

                cost += cost(y, hwx) / j.size();

                w0 = GD(w0, alpha, y, hwx);
                w1 = GD(w1, alpha, y, hwx, x1);
                w2 = GD(w2, alpha, y, hwx, x2);

            }
            // Data End

            System.out.printf("cost: %s, w0: %s, w1: %s, w2: %s%n", cost, w0, w1, w2);
            sleep(50);
        }
        // Train End
    }

    // ==================== Hypo
    private static double Hypofunction(List<Double> input, double w0, double w1, double w2) {

        double x1 = input.get(0);
        double x2 = input.get(1);

        return g(w0 + w1 * x1 + w2 * x2);

    }

    // Sigmoid function
    private static double g(double wtx) {
        return 1 / (1 + Math.pow(Math.E, -wtx));
    }

    // Cost function
    private static double cost(int y, double hwx) {
        if (y == 1) {
            return -Math.log(hwx);
        } else {
            return -Math.log(1 - hwx);
        }
    }

    // Gradient Descents
    private static double GD(double w, double aplha, int y, double hwx, double x) {
        return w + aplha * (y - hwx) * x;
    }

    private static double GD(double w, double aplha, int y, double hwx) {
        return w + aplha * (y - hwx);
    }

    // ===================================================================================================== Reader

    private static void dataRead() throws IOException {

        BufferedReader b = new BufferedReader(new FileReader(DATA_FILE));
        String i;

        while ((i = b.readLine()) != null) {
            String[] tube = i.split(",");
            ArrayList<Double> container = new ArrayList<>();

            for (String j : tube) {
                double temp_num = Double.parseDouble(j);
                container.add(temp_num);
            }
            data.add(container);
        }
    }

    // ===================================================================================================== Painting


    // ==================================================================================================== Waiting

    private static void sleep(int ticks) {
        try {
            Thread.sleep(ticks);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
