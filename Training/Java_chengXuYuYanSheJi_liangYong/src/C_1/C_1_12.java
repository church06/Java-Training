package C_1;

public class C_1_12 {

    public static void main(String[] args) {
        double seconds =  1 * Math.pow(60, 2) + 45 * 60 + 30;
        double hour = seconds / Math.pow(60, 2);
        double ukkm_h =24 / 1.6 / hour;
        System.out.println(ukkm_h);
    }
}
