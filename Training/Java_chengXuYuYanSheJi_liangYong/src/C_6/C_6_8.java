package C_6;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class C_6_8 {

    public static void main(String[] args) {
        C68_method();
    }

    public static void C68_method() {

        int i = 120;

        System.out.println("摄氏度    华氏度      华氏度    摄氏度");

        for (int j = 31; j <= 40; j++) {
            BigDecimal c = BigDecimal.valueOf(celsiusToFahrenheit(j)).setScale(2, RoundingMode.HALF_EVEN);
            BigDecimal f = BigDecimal.valueOf(fahrenheitToCelsius(i)).setScale(2, RoundingMode.HALF_EVEN);

            System.out.printf("%-6s   %-6s     %-6s   %s%n", j, c, i, f);

            i -= 10;
        }
    }

    public static double celsiusToFahrenheit(double Celsius) {
        return (9.0 / 5) * Celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
