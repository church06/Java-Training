package Arrays;

import java.util.Arrays;
/*
 * java.util.Arrays是一个与数组相关的工具类，里面提供了大量静态方法，用来实现数组常见操作
 * public static String toString(数组)，将参数数组编程字符串(按照默认格式：[元素1，元素2，...])
 * public static void sort(数组)，按照默认升序(从小到大)对数组的元素进行排序
 *
 * 备注：
 * 1. 数值，sort按照默认升序小到大
 * 2. 字符串，sort默认按照字母升序
 * 3. 自定义类型，该定义类需要有Comparable或Comparator接口的支持
 * */

public class Demo01Arrays {

    public static void main(String[] args) {
        int[] intArray = {10, 20, 30};
        // 将int[]数组按照默认格式变成字符串
        String intstr = Arrays.toString(intArray);
        System.out.println(intstr);

        int[] array1 = {2, 1, 3, 10, 6};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1)); // [1, 2, 3, 6 10]

        String[] array2 = {"ccc", "aaa", "bbb"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2)); // [aaa, bbb, ccc]
    }
}
