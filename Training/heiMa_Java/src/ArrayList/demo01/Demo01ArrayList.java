package ArrayList.demo01;
/*
* 定义一个数组用来存储三个Person对象
*
* */
public class Demo01ArrayList {
    public static void main(String[] args) {
        Person[] array = new Person[3];
        Person a = new Person("1", 18);
        Person b = new Person("2", 28);
        Person c = new Person("3", 108);

        // 将a的地址值赋值到数组0号元素位置
        array[0] = a;
        array[1] = b;
        array[2] = c;

        System.out.println(array[0]); // 地址值
        System.out.println(array[1]); // 地址值
        System.out.println(array[2]); // 地址值

        System.out.println(array[1].getName());
    }
}
