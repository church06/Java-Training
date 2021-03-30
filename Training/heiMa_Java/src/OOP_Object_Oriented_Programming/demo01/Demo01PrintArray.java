package OOP_Object_Oriented_Programming.demo01;

import java.util.Arrays;

public class Demo01PrintArray {
    /*
    * 面向过程：当实现一个功能时，每一个vt步骤都需要亲力亲为，详细处理每一个细节
    * 面向对象：实现一个功能时，不关心具体步骤，找一个具有该功能的人帮忙做事
    * */
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};

        //要求打印格式为：[10, 20, 30, 40, 50]
        //使用面向过程，每一个步骤都需要亲力亲为
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if(i == array.length - 1) { // 如果是最后一个元素
                System.out.println(array[i] + "]");
            } else { // 如果不是最后一个元素
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("======================");

        // 面向对象编程
        // JDK中提供好的Arrays类
        // 其中一个toString方法，直接将数组编程想要的格式
        System.out.println(Arrays.toString(array));
    }
}
