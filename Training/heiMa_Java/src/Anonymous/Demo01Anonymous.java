package Anonymous;

/*
* 创建对象的标准格式
* 类名称 对象名 = new 类名称();
*
* 匿名对象就是只有邮编的对象，没有左边的名字和复制运算符
* new 类名称();
*
* 注意事项：匿名对象只能用唯一的一次，下次再用将不得不创建一个新对象
* 使用建议：如果确定一个对象只需要使用唯一的一次就可以使用匿名对象
* */

public class Demo01Anonymous {
    public static void main(String[] args) {

        Person one = new Person();
        one.name = "ZYY";
        one.showName(); // 高圆圆
        System.out.println("=====================");

        // 匿名对象
        new Person().name = "ZYT";
        new Person().showName(); // null
    }
}
