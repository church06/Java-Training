package Interface.demo02;

/*
* 使用接口时：
* 1. 接口时没有静态代码块或构造方法的
* 2. 一个类的直接父类唯一，但是可以一个类同时实现多个接口
* 格式：
* public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB {
*       // 覆写所有抽象方法
* }
* 3. 若实现类所实现的多个接口当中存在重复抽象方法，那么只需覆写一次即可
* 4. 如果实现类没有覆写所有接口中的抽象方法，那么实现类必须就是一个抽象类
* 5. 若实现类所实现的多个接口当中，存在重复默认方法，那么实现类一定对冲突的默认方法进行覆写
* 6. 一个类，若父类当中的方法直接和接口当中的默认方法产生冲突，优先用父类方法
* */

public class Demo01Interface {

    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method();
    }
}
