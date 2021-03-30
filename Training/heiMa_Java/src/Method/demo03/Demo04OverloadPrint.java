package Method.demo03;

public class Demo04OverloadPrint {
    /*
    * byte short int long float double char boolean
    * String
    * 调用输出语句是，println方法其实机进行了多种数据的重载形式
    * shift + f6 改变所有相同名称变量的名字
    * */
    public static void main(String[] args) {
        myPrint(1);
        myPrint((char)1);
        myPrint(1L);
        myPrint(1.1);
        myPrint(1.1F);
        myPrint((short)1);
        myPrint((byte) 1);
        myPrint(true);
        myPrint("1");
    }
    public static void myPrint(byte num) {
        System.out.println(num);
    }
    public static void myPrint(short num) {
        System.out.println(num);
    }
    public static void myPrint(int num) {
        System.out.println(num);
    }
    public static void myPrint(long num) {
        System.out.println(num);
    }
    public static void myPrint(float num) {
        System.out.println(num);
    }
    public static void myPrint(double num) {
        System.out.println(num);
    }
    public static void myPrint(String num) {
        System.out.println(num);
    }
    public static void myPrint(char num) {
        System.out.println(num);
    }
    public static void myPrint(boolean num) {
        System.out.println(num);
    }
}
