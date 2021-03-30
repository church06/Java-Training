package Method.demo02;

public class Demo01MethodSame {
    public static void main(String[] arga) {
        if (isSame(991, 23734)) {
            System.out.println("Same");
        }
        else
            System.out.println("False");
    }
    public static boolean isSame(int a, int b) {
        return a== b;
    }
}
