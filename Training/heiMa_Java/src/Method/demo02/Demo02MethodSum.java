package Method.demo02;

public class Demo02MethodSum {
    public static void main(String[] args) {
        /*求1~100的所有数字和
         * 三要素
         * 返回值：需要，返回int
         * 方法名称：getSum
         * 参数列表：数据范围确定且固定不需要额外条件，不需要参数，可独立执行*/
        System.out.println("结果是：" + getSum());
    }

    public static int getSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
