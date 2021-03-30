package Array.demo03;

public class Demo04Array {
    /*
     * 遍历数组，即对数组当中每个元素逐一挨个处理。默认处理方式为打印输出
     * */
    public static void main(String[] args) {
        int[] array = {12, 25, 60, 64, 234534, 234};

        //原始打印
        System.out.println("纯打印：");
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println(array[5]);
        System.out.println("=================");

        //for循环
        System.out.println("for 循环：");
        for (int i = 0; i < 6; i++) {
            System.out.println(array[i]);
        }
        System.out.println("=================");

        //使用循环，次数为数组长度 array.fori
        System.out.println("for 循环数组长度：");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("=================");

        //while 循环
        System.out.println("while 循环数组长度：");
        int i = 0;
        while(i < array.length) {
            System.out.println(array[i]);
            ++i;
        }
    }
}
