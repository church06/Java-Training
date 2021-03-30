package Inherit.demo02;

public class Zi extends Fu{

    int numZi = 20;

    int num = 200;

    public void methodZi() {
        // 本类中有num，先用子类
        System.out.println(num);
    }
}
