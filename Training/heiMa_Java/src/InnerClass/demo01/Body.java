package InnerClass.demo01;

public class Body {

    public class Heart { // 成员内部类

        //内部类方法
        public void beat() {
            System.out.println("bb~bb~bb~");
            System.out.println("name: " + name);
        }
    }

    // 外部类的成员变量
    private String name;

    // 外部类方法
    public void methodBody() {
        System.out.println("外部类方法");
        new Heart().beat();

    }

// =================================================

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
