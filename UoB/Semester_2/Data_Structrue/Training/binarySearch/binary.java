package binarySearch;

public class binary {

    // Constructor
    public binary() {
    }

    // Sort for double
    public double[] list_sort_double(double[] input) {
        boolean counter;

        do {
            counter = false;

            for (int i = 0; i < input.length - 1; i++) {

                double a = input[i];
                double b = input[i + 1];

                if (b < a) {
                    counter = true;
                    input[i + 1] = a;
                    input[i] = b;

                }
            }

        } while (counter);

        return input;

    }

    // Sort for int
    public int[] list_sort_int(int[] input) {
        boolean counter;

        do {
            counter = false;

            for (int i = 0; i < input.length - 1; i++) {

                int a = input[i];
                int b = input[i + 1];

                if (b < a) {
                    counter = true;
                    input[i + 1] = a;
                    input[i] = b;

                }
            }

        } while (counter);

        return input;
    }

    //Sort for float
    public float[] list_sort_float(float[] input) {
        boolean counter;

        do {
            counter = false;

            for (int i = 0; i < input.length - 1; i++) {

                float a = input[i];
                float b = input[i + 1];

                if (b < a) {
                    counter = true;
                    input[i + 1] = a;
                    input[i] = b;

                }
            }

        } while (counter);

        return input;
    }

    // ====================================================================================== Binary Search

    // for double
    public double double_search(double[] input_list, double input) {
        int i = input_list.length / 2;

        int counter = 0;

        while (true) {

            int pre_i = i;

            if (input_list[i] == input) {
                return i;

            } else if (input_list[i] < input) {
                i += i / 2;

            } else if (input_list[i] > input) {
                i /= 2;
            }

            if (i == pre_i) {
                counter++;
            }

            if (counter >= 3) {
                return -1;
            }

        }
    }

    // for int
    public int int_search(int[] input_list, int input) {
        int i = input_list.length / 2;

        int counter = 0;

        while (true) {

            int pre_i = i;

            if (input_list[i] == input) {
                return i;

            } else if (input_list[i] < input) {
                i += i / 2;

            } else if (input_list[i] > input) {
                i /= 2;
            }

            if (i == pre_i) {
                counter++;
            }

            if (counter >= 3) {
                return -1;
            }

        }
    }

    // for float
    public int float_search(float[] input_list, float input) {
        int i = input_list.length / 2;

        int counter = 0;

        while (true) {
            int pre_i = i;

            if (input_list[i] == input) {
                return i;

            } else if (input_list[i] < input) {
                i += (input_list.length - i) / 2;

            } else if (input_list[i] > input) {
                i /= 2;
            }

            if (i == pre_i) {
                counter++;
            }

            if (counter >= 3) {
                return -1;
            }

        }
    }

}
