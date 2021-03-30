package ArrayList.demo01;

import java.util.ArrayList;

public class Demo03ArrayListMethod {
    /*
    * ArrayList常用方法：
    * public boolean add(E e): 想集合中添加元素，参数类型和泛型一致
    * public E get(int index): 从集合中获取元素，参数为索引编号，返回值为位置
    * public int size(): 获取集合的尺寸长度，返回值为集合中包含的元素个数
    * */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list); // []

        //向集合中添加元素，add
        boolean success = list.add("1");
        System.out.println(list); // [1]
        System.out.println(success); // true

        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");

        System.out.println(list); //[1, 2, 3, 4, 5, 6]

        //集合中获取元素，get。从0开始
        String name = list.get(2);
        System.out.println(name);

        //删除集合中的元素，remove。索引值从0开始
        String whoRemoved = list.remove(3);
        System.out.println(whoRemoved); // 4
        System.out.println(list); // [1, 2, 3, 5, 6]

        //获取集合的长度尺寸，即元素中的个数
        int size = list.size();
        System.out.println();
    }
}
