package ArrayList.demo02;

/*
 * 题目：
 * 用一个大集合存入20个随机数，然后筛选其中的偶数，放到小集合当中
 * 要求使用自定义的方法来实现筛选
 *
 * 分析：
 * 1. 需要创建一个大集合，用来存储int数字，<Integer>
 * 2. 随机数字用Random nextInt
 * 3. 循环20次，把随机数字放入大集合，for循环，add方法
 * 4. 定义一个方法，用来进行筛选
 *
 * 筛选：根据大集合，筛选符合要求的元素，得到小集合
 *
 * 三要素
 * 返回值类型：ArrayList小集合 (元素个数不确定)
 * 方法名称：getSmallList
 * 参数列表ArrayList大集合 (装20个随机数字)
 *
 * 5. 判断(if)是偶数，num % 2 == 0
 * 6. 如果是偶数，就放到小集合中，否则不放
 * */

import java.util.ArrayList;
import java.util.Random;

public class Demo04ArrayListReturn {

    public static void main(String[] args) {
        Random a = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int num = a.nextInt(50);
            list.add(num);
        }
        Demo04ArrayListReturn d4 = new Demo04ArrayListReturn();
        ArrayList<Integer> even = new ArrayList<>();
        even = d4.getSmallList(list);
        System.out.println( even + " 总数为：" + even.size());
    }

    public ArrayList<Integer> getSmallList(ArrayList<Integer> list) {
        ArrayList<Integer> even = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                int target = list.get(i);
                even.add(target);
            }
        }


        return even;
    }
}
