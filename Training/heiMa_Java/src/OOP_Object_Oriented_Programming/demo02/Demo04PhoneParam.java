package OOP_Object_Oriented_Programming.demo02;

public class Demo04PhoneParam {

    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 8848;
        one.color = "黑色";

        method(one); // 传递进去的是地址值
    }

    public static void method(Phone param) {
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
    }
}
