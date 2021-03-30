package Inherit.demo10;

public class Zi extends Fu {

    int num = 20;

    public void method() {
        super.method();
        System.out.println("子类方法");
    }

    public void show() {
        int num = 30;
        System.out.println(num); // 30
        System.out.println(this.num); // 20
        System.out.println(super.num); // 10
    }
}
