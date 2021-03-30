package Array.demo01;

public class Demo01Array {
    /*
    * 数组：是一个容器，可以同事存放多个数据值
    *
    * 数组的特点
    * 1. 数组为引用类型
    * 2. 数组当中的多个数据，类型必须统一
    * 3. 数组的长度在运行期间不可进行长度修改
    *
    * 数组的初始化
    * 1. 动态初始化(指定长度)
    * 2. 静态初始化(指定内容)
    *
    * 动态初始化的格式：
    * 数据类型[] 数组名称 = new 数据类型[数组长度]
    * 解析含义：
    * 左侧数据类型：数组中保存的数据统一类型
    * 左侧中括号：代表这是数组
    * 左侧数组名称：对数组命名
    * 右侧new：代表创建数组的动作
    * 右侧数据类型：必须与左侧保持一致
    * 右侧中括号长长度：决定数组中能存放多少数据
    * */
    public static void main(String [] args) {
        // 创建个数组，存放300个int数据
        int[] arrayA = new int[300];

        // 创建数组，存放10 x double
        double[] arrayB = new double[10];

        //创建数组，存放5 x String
        String[] arrayC = new String[5];
    }
}
