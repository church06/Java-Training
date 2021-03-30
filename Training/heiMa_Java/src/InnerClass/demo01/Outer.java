package InnerClass.demo01;

// 如果出现崇明现象，则格式为：外部类名称.this.外部类成员变量
public class Outer {

    int num = 10; // 外部成员变量

    public class Inner {

        int num = 20; // 内部成员变量

        public void methodInner() {
            int num = 30; // 内部类方法的局部变量

            System.out.println(num); // 局部变量，就近原则
            System.out.println(this.num); // 内部类成员变量
            System.out.println(Outer.this.num); // 外部类成员变量
        }

    }
}
