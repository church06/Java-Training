package Inherit.demo07;

/*
* 继承关系中，父类构造方法的访问特点
*
* 1. 子类构造方法中，默认隐含super()调用。子类必须调用父类构造方法，因此必然先调用父类构造，而后执行子类构造
* 2. 可以通过super关键字来调用父类构造
* 3. super的父类构造调用，必须是子类构造方法的第一个语句。不能一个字累构造调用多次super构造
* 总结：
* 子类必须调用父类构造方法，不写自带super(); 写了则用写的指定super调用，super只能有一个，且必须是第一个
* */

public class Demo01Constructor {

    public static void main(String[] args) {
        Zi zi = new Zi();
    }
}
