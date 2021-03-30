package OOP_Object_Oriented_Programming.demo02;

public class Demo01PhoneOne {
    public static void main(String[] args) {
        //根据phone类创建名为one的对象
        //格式：类名称 对象名 = new 类名称();
        Phone one = new Phone();
        System.out.println(one.brand); // null
        System.out.println(one.price); // 0.0
        System.out.println(one.color); // null
        System.out.println("====================");

        one.brand = "苹果";
        one.price = 8848;
        one.color = "黑色";
        System.out.println(one.brand); // 苹果
        System.out.println(one.price); // 8848.0
        System.out.println(one.color); // 黑色
        System.out.println("====================");

        one.call("Jbs");
        one.sendMessage();
    }
}

