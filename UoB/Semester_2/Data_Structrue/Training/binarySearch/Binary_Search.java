package binarySearch;

import java.util.Arrays;

public class Binary_Search {

    public static void main(String[] args) {
        double[] list_double = {1.0, 34.0, 34534.0, 2.0, 4.0, 3.0, 15.0, 10.0};
        int[] list_int = {1, 4, 3, 5, 6, 5, 5, 3, 3, 2, 6, 7, 4, 4, 8, 5, 10, 11, 27, 11, 25, 46, 35, 78, 26};
        float[] list_float = {1.0f, 34.0f, 34534.0f, 2.0f, 4.0f, 3.0f, 15.0f, 10.0f, 12.0f, 45.0f, 3454.345f, 76.465f, 12.560567f};

        binary binary = new binary();

        list_double = binary.list_sort_double(list_double);
        list_int = binary.list_sort_int(list_int);
        list_float = binary.list_sort_float(list_float);

        System.out.println(10.0 + " " + binary.double_search(list_double, 2.5));
        System.out.println(Arrays.toString(list_double));

        System.out.println(6 + " " + binary.int_search(list_int, 6));
        System.out.println(Arrays.toString(list_int));

        System.out.println(10.0f + " " + binary.float_search(list_float, 10.0f));
        System.out.println(Arrays.toString(list_float));

    }


}
