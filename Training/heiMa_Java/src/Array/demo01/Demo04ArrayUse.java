package Array.demo01;

public class Demo04ArrayUse {
    /*
    * 直接打印数组名称得到的是队组对应的内存地址哈希值
    * 二进制：01
    * 十进制：0123456789
    * 16进制：0123456789abcdef
    *
    * 访问数组的格式: 数组名称[索引值]
    * 索引值：int数字
    * 注意：索引值从0开始到长度-1为止
    * */
    public static void main(String[] args) {
        int[] array = {1,7542 ,727 ,8 ,5 ,6 ,152 ,48};
        System.out.println(array); // 内存地址哈希值：[I@7c30a502
        System.out.println(array[0]);
        System.out.println(array[4]);
        System.out.println(array[7]);
    }
}
