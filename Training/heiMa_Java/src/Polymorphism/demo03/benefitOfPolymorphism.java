package Polymorphism.demo03;

public class benefitOfPolymorphism {
    /*
     * 不用多态，只用子类。写法为：
     * Teacher one = new Teacher();
     * one.work(); // 讲课
     * Assistant two = new Assistant();
     * two.work(); // 辅导
     *
     * 只调用work方法且其他不关心
     *
     * 多态写法：
     * Employee one = new Teacher();
     * one.work(); // 讲课
     * Employee two = new Assistant();
     * two.work(); // 辅导
     *
     * 好处：无论右边new的时候换成那个子类对象，等号左边调用方法都不会变化
     * */
}
