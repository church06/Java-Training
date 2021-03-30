package Array.demo04;

public class Demo02ArrayReturn {
    public static void main(String[] args) {
        /*
         * 一个方法可以有0，1多个参数，但只有0或1个返回值，不能有多个返回值
         * 若希望一个方法中产生多个结果数据进行返回，则需要使用数组作为返回值类型即可
         * */
        int[] result = calculate(10, 20, 30);
        System.out.println(result); //地址值
        System.out.println("总和: " + result[0]);
        System.out.println("平均数：" + result[1]);
    }

    public static int[] calculate(int a, int b, int c) {
        int sum = a + b + c; // 总和
        int avg = sum / 3; // 平均
        //两个结果都希望进行返回

        //需要一个数组，即一个塑料兜，数组可以保存多个结果
        /*
         * int[] array = new int[2];
         * array[0] = sum; 总和
         * array[1] = avg 平均数
         * */
        int[] array = {sum, avg};
        return array;
    }
}
