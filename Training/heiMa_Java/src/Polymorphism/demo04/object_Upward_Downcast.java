package Polymorphism.demo04;

public class object_Upward_Downcast {
    /*
     * 1. 对象的向上转型其实是多态写法：
     *   格式：父类名称 对象名 = new 子类名称();      |  Animal animal = new Cat();
     *   含义：右侧创建一个子类对象，把它当作父类看待使用 |  创建一只猫，当作动物看待
     *
     * 注意事项：向上转型一定安全。从小范围转到大范围
     *
     * 类似：
     * double num = 100; // 正确, int --> double，自动类型转换
     *
     *
     *
     * 2. 对象向下转型是【还原】动作
     *   格式：子类名称 对象名 = (子类名称) 父类对象;  |  Animal animal = new Cat(); // 本来是猫，向上转型为动物
     *   含义：将父类对象,【还原】成为子类对象         |  Cat cat = (Cat)animal; // 本来是猫，后被当作动物，现在还原回去
     *
     * 注意事项：
     * A.必须保证对象本来创建时就是猫，才能向下转型为猫
     * B.若对象创建时不是猫而强制转型为猫则报错
     *
     * 类比：
     * int num = (int) 10.0; // 可以
     * int num = (int) 10.5; //  精度损失
     * */
}
