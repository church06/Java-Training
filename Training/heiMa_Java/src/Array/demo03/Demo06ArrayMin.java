package Array.demo03;

public class Demo06ArrayMin {
    /*
     *
     * */
    public static void main(String[] args) {
        int[] array = {5, 6, 445, 345, 67, 25645, 4356, 435773,};

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            //如果当前元素比min小，则换人
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
