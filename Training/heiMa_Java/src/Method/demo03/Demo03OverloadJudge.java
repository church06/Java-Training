package Method.demo03;

public class Demo03OverloadJudge {

    public static void open() { // 正确重载
    }

    public static void open(int a) { // 正确重载
    }

    static void open(int a, int b) { // 代码错误，和26行冲突
    }

    public static void open(double a, int b) { // 正确重载
    }

    public static void open(int a, double b) { // 代码错误，和20行冲突
    }

//  public void open(int i, double b) { // 代码错误，和17行冲突
//  }

    public static void OPEN() { // 代码正确不会报错，但并非有效重载
    }

//  public static void open(int i, int j) { // 代码错误，和11行冲突
//  }
}
