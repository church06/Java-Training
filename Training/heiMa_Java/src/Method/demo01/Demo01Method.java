package Method.demo01;

public class Demo01Method {
    /*
    * 定义格式:
    * public static void 方法名称() {
    *   方法体
    * }
    *
    * 调用格式:
    * 方法名称();
    *
    * 注意事项:
    * 1. 方法定义先后顺序无所谓
    * 2. 方法定义必须挨着，不能再方法内部定义另外一个方法
    * 3. 方法定义后自己不会执行，希望执行则需要进行方法调用
    */
    public static void main(String[] args) {
        printMethod();
    }
    public static void printMethod() {
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 20; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
