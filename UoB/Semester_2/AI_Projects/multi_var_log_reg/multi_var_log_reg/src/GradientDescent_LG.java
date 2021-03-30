import java.util.List;

public class GradientDescent_LG {

    public static final String DATA_FILE = "G:\\Entrance\\JavaProgram\\Training_and_UoB\\AI_Projects\\multi_var_log_reg\\multi_var_log_reg\\data/q2.csv";//"data/example_small.csv";//"data/MacdonellDF.csv";

    public static double sigmoid(double x) {
        return (1 / (1 + Math.pow(Math.E, (-1 * x))));
    }

    public static void main(String[] args) {

        // -------------------------------------------------
        // Data and Graph setup.
        // -------------------------------------------------
        List<List<Double>> data = Data.dataFrom(DATA_FILE);
        Plot_LG plt = new Plot_LG("x1 vs x2", "x1", "x2", data);
        sleep(500);

        // -------------------------------------------------
        // Gradient Descent
        // -------------------------------------------------
        final int epochs = 1000;  // Number of iterations we want to run through the algorithm

        // We want to predict h(x) = w2 * x * x + w1 * x + w0
        double w2 = 0;
        double w1 = 0;
        double w0 = 0;

        // Learning rate
        double alpha = 0.1;

        // Main Gradient Descent Function for Linear Regression
        for (int i = 0; i < epochs; i++) {

            double cost = 0;

            for (int j = 0; j < data.get(0).size(); j++) {

                double x1_j = data.get(0).get(j);

                double x2_j = data.get(1).get(j);

                double y_j = data.get(2).get(j);

                double prediction = sigmoid((w2 * x2_j) + (w1 * x1_j) + w0);

                // cost += (y_j - h(x))^2
                cost += -1 * (y_j * Math.log(prediction) + (1 - y_j) * (Math.log(1 - prediction)));

                // Update the parameters for our equation.
                w2 += alpha * (y_j - prediction) * x2_j;
                w1 += alpha * (y_j - prediction) * x1_j;
                w0 += alpha * (y_j - prediction);

            }

            System.out.println("Current Cost: " + cost);


            // ---------------------------------------------
            // Our Hypothesis Function after the epoch
            // (these values are final because of how
            // functional programming works in Java).
            final double w_2 = w2;
            final double w_1 = w1;
            final double w_0 = w0;
            HypothesisFunction_LG h_x = (x) -> ((-w_1 * x - w_0) / w_2);
            //(x1,x2) -> (w_2 * x2) + (w_1 * x1) + w_0;
            // ----------------------------------------------
            // Plotting prediction with current values of w
            plt.updatePlot(h_x);
            sleep(50);
            // ----------------------------------------------
        }


        System.out.println("Final Equation: h(x) = (" + w2 + " * x2 ) + (" + w1 + " * x1) + " + w0);
    }

    private static void sleep(int ticks) {
        try {
            Thread.sleep(ticks);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
