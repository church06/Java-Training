package Method.demo03;

public class Demo02MethodOverloadSame {
    /*
    * 判断两个数据是否想等
    * 参数类型分别为 byte，short，int，long*/
    public static void main(String[] args) {
        System.out.println(isSame((byte) 10, (byte) 11));
        System.out.println(isSame((short) 10, (short) 11));
        System.out.println(isSame( 10, 11));
        System.out.println(isSame(10L, 11L));
    }
    public static boolean isSame(byte a, byte b) {
        System.out.println("2 x byte: ");
        boolean same;
        if (a == b) {
            same = true;
        }
        else
            same = false;
        return same;
    }

    public static boolean isSame(short a, short b) {
        System.out.println("2 x short: ");
        boolean same;
        if (a == b) {
            same = true;
        }
        else
            same = false;
        return same;
    }

    public static boolean isSame(int a, int b) {
        System.out.println("2 x int: ");
        boolean same;
        if (a == b) {
            same = true;
        }
        else
            same = false;
        return same;
    }

    public static boolean isSame(long a, long b) {
        System.out.println("2 x long: ");
        boolean same;
        if (a == b) {
            same = true;
        }
        else
            same = false;
        return same;
    }
}
