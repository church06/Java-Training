package Array.demo03;

public class Demo03ArrayLength {
    /*
     * 获取数组长度：
     * 数组名称.length
     *
     * 会得到一个int数字，代表数组长度
     *
     * 数组一旦创建，程序运行期间，长度不可改变
     * */
    public static void main(String[] args) {
        int[] arrayA = new int[3];

        int[] arrayB = {6, 51, 65, 43, 51, 6, 515, 48, 16, 54};
        int len = arrayB.length;
        System.out.println("Length of Array: " + len);
        System.out.println("==================");

        int[] arrayC = new int[3];
        System.out.println(arrayC.length); // 3
        arrayC = new int[5];
        System.out.println(arrayC); // 5
    }
}
