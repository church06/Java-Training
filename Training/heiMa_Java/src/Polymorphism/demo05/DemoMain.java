package Polymorphism.demo05;

public class DemoMain {

    public static void main(String[] args) {
        Laptop computer = new Laptop();
        computer.powerOn();

        // 准备鼠标供电脑使用
        Mouse mouse = new Mouse();
        // 先向上转型
        USB usbMouse = new Mouse();
        // 传递USB鼠标
        computer.useDevice(usbMouse);


        // 创建USB键盘
        Keyboard keyboard = new Keyboard(); // 没用多态
        // 方法参数是USB类型，传递进去的是实现类对象
        computer.useDevice(keyboard); // 向上转型

        computer.powerOff();
        System.out.println("===============================");

        method(10.0); // 正确写法,  double -> double
        method(10);   // 正确写法,  int -> double
    }

    public static void method(double num) {
        System.out.println(num);
    }
}
