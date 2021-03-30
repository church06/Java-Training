package Method.demo02;

public class Demo03MethodPrint {
    public static void main(String[] args) {
        /*定义一个方法打印指定次数的HelloWorld
        *
        * 三要素
        * 返回值类型：String，无需告诉调用处
        * 方法名称：printCount
        * 参数列表：打印次数，参数int*/
        printCount(50);
    }
    public static void printCount(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("HelloWorld " + (i + 1));
        }
    }
}
