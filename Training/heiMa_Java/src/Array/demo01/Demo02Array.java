package Array.demo01;

public class Demo02Array {
    /*
    * 动态初始化(指定长度)：创建时指定个数
    * 形态初始化(指定内容)：创建时直接将内容确定，不需要指定长度
    *
    * 静态初始化格式
    * 数组类型[] 数组名称= new 数据类型[]{元素1，元素2，元素3，...}
    *
    * 注意事项
    * 1. 数组一定有长度，静态不需要长度但可以通过元素具体内容推算出长度
    * */
    public static void main(String[] args) {
        int[] arrayA = new int[] {4, 5, 6, 8, 10};
        String[] arrayB = new String[] {"11", "22", };
    }
}
