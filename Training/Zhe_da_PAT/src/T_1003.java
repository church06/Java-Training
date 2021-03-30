import java.util.Scanner;

public class T_1003 {

    public static void main(String[] args) {
        T_1003 one = new T_1003();
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();
        for (int i = 0; i < counter; i++) {
            String input = sc.next();
            output(one.recognize(input));
        }


    }

// ============================================================================

    public boolean recognize(String target) {
        char[] chars = target.toCharArray();
        if (all_A(chars)) {
            return xPATx(target) || aPbTc_aPbATca(target);
        } else {
            return false;
        }
    }

// ============================================================================

    public boolean xPATx(String target) {
        boolean result = false;

        if (target.contains("PAT")) {
            result = counter_xPATx(target);
        }
        return result;
    }

    public static boolean counter_xPATx(String target) {

        boolean result = false;
        for (int i = target.indexOf("T") + 1; i < target.length(); i++) {
            for (int j = 0; j < target.indexOf("P"); j++) {
                result = i == j;
            }
        }
        return result;
    }

// ============================================================================

    public boolean aPbTc_aPbATca(String target) {
        boolean result = false;
        if (target.contains("A") && target.contains("P") && target.contains("T")) {
            result = counter_aPbTc_aPbATca(target);
        }
        return result;

    }

    public static boolean counter_aPbTc_aPbATca(String target) {
        boolean result = false;
        int a = 0;
        int b = 0;
        int c = 0;
        int count = 0;

        for (int i = 0; i < target.indexOf("P"); i++) {
            a++;
            for (int j = 0; j < target.indexOf("T") - 1; j++) {
                b++;
                for (int k = target.indexOf("T") + 1; k < target.length(); k++) {
                    c++;
                }
            }
        }


        return result;
    }

// ============================================================================

    public static boolean all_A(char[] target) {
        boolean result = false;
        for (char c : target) {
            result = c == 'P' || c == 'A' || c == 'T';
        }
        return result;
    }

// ============================================================================

    public static void output(boolean panduan) {
        if (panduan) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}