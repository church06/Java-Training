package OOP_Object_Oriented_Programming.demo03;

/*
 * 面向对象三大特性：封装、继承、多态
 *
 * 封装性在Java中体现：
 * 1. 方法就是一种封装
 * 2. 关键字private也是一种封装
 *
 * 封装就是将一些细节信息隐藏起来，对于外界不可见
 * */

public class Demo02Method {
    public static void main(String[] args) {
        int[] array = {5, 15, 20, 25, 100};
        int max = getMax(array);
        System.out.println("最大值" + max);
    }

    private static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
