package Array.demo04;

public class Demo01ArrayParam {
    public static void main(String[] args) {
    /*
    * 数组可以作为方法的参数
    * 当调用方法时，想方法的小括号进行传参，传递进去的其实是数组的地址值
    * */
        int[] array = {10, 20, 30, 40, 50};
        printArray(array);
        System.out.println("======================");
        printArray(array);
        System.out.println("======================");
        printArray(array);
    }
    /*
    * 三要素：
    *
    * 返回值类型：只进行打印，不需要计算，也没有结果，用void
    * 方法名称：printArray
    * 参数列表：必须有数组才能打印其中元素 int[] array
    * */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
