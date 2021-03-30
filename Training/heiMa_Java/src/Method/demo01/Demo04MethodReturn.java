package Method.demo01;

public class Demo04MethodReturn {
    public static void main(String[] args) {
        //调用getSum，获取其返回值result
        int num = getSum(999, 127);
        System.out.println(num);
        printing();
    }
    //负责两数相加
    //有返回值int，将结果交给调用处
    public static int getSum(int a, int b) {
        int result = a + b;
        return result;
    }
    public static void printing() {
        System.out.println("(,,´•ω•)ノ(´っω•｀。)");
    }
}
