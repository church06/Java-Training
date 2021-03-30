package ArrayList.demo02;

/*
 * 题目：自定义4个学生，添加到集合中，并遍历
 *
 * 思路：
 * 1. 自定义Student学生类，4个部分
 * 2. 创建一个集合，存储学生对象。泛型，<String>
 * 3. 根据类创建4个学生对象
 * 4. 将4个学生对象添加到集合中，add
 * 5. 遍历集合，for，size，get
 *
 * */

import java.util.ArrayList;

public class Demo02ArrayListStudent {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("1", 15);
        Student two = new Student("2", 18);
        Student three = new Student("3", 151);
        Student four = new Student("4", 1500);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student show = list.get(i);
            System.out.println("姓名：" + show.getName() + " 年龄：" + show.getAge());
        }
    }
}
