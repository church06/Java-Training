package Inherit.demo02;

public class Fu {
    int numFu = 10;

    int num = 100;

    public void methodFu() {
        // 使用的是本类当中，不会找子类
        System.out.println(num);
    }
}
