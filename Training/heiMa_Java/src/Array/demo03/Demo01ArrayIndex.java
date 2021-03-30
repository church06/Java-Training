package Array.demo03;

public class Demo01ArrayIndex {
    public static void main(String[] args) {
        /*
        * 数组索引从0开始，直到数组长度-1为止
        *
        * 若访问数组元素时，索引编号不存在，则发生
        * 数组越界异常
        * ArrayIndexOutOfBoundException
        *
        * 原因：索引编错误
        * 解决：修改为正确索引编号
        * */
        int[] array = {15, 24, 35};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        //System.out.println(array[3]);
    }
}
