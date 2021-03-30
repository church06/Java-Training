package Array.demo01;

public class Demo05ArrayUse {
    /*
    * 使用动态初始化数组时，其中元素将自动拥有默认值。规则如下：
    * 1. 整数类型，默认为0；
    * 2. 浮点类型，默认为0.0；
    * 3. 字符类型，默认为'\u0000';
    * 4. 布尔类型，默认为false;
    * 5. 引用类型，默认为null;
    *
    * 注意事项
    * 静态初始化也有默认值的过程，只不过系统自动立即将默认值替换成打括号中的具体数值
    * */
    public static void main(String[] args) {

        int[] array = new int[3];
        System.out.println(array); // 内存地址
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("===========");

        //将数据123赋值给array当中一号元素
        array[1] = 123;
        System.out.println(array[0]);
        System.out.println(array[1]); // 123
        System.out.println(array[2]); // 0
    }
}
