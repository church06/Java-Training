package Interface.demo01;

public class MyInterfaceDefaultB implements MyInterfaceDefault{

    @Override
    public void methodAbs() {

        System.out.println("实现了抽象方法BBB");
    }

    @Override
    public void methodDefault() {
        System.out.println("实际类接口B覆写了接口的默认方法");
    }
}
