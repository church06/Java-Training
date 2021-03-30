package Array.demo03;

public class Demo07ArrayReverse {
    /*
     * 数组元素反转：
     * 原始：[1, 2, 3, 4]
     * 倒置：[4, 3, 2, 1]
     *
     * 要求：不能用新数组，只使用原来唯一一个数组
     *
     *
     * */
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        //遍历打印数组原本的样子
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("====================");

        /*
        * 初始化语句：int min = 0, max = array.length - 1
        * 条件判断：min < max
        * 步进表达式：min++, min--
        * 循环体：用第三个变量倒手
        * */
        for (int min = 0, max = array.length; min < max; min++, max--) {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;

        }
    }
}
