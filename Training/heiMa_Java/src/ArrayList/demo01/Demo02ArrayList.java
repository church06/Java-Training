package ArrayList.demo01;

import java.util.ArrayList;

/*
* 数组长度不可以发生改变
* 但ArrayList可以改变
*
* ArrayList有<E>，代表泛型
* 泛型：集合中所有元素需要统一，且只能是引用类型不能为基本类型
*
* 注意事项：
* ArrayList直接打印为内容，若内容为空则为[]，并非地址值
* */
public class Demo02ArrayList {

    // 创建一个名为list的ArrayList，储存数据类型均为String
    //Tips: 从JD 1.7开始，右侧尖括号内部可以不写内容，但<>本身要写
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        System.out.println(list); // []
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.println(list); // [1, 2, 3, 4]
    }
}
