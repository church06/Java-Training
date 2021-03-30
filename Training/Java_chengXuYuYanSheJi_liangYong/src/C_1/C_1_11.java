package C_1;

public class C_1_11 {

    public static void main(String[] args) {
        int born = 7;
        int death = 13;
        int migrate = 45;
        double time = Math.pow(60, 2) * 24 * 365 * 5;
        int population = 312032486;
        for (int i = 0; i < time; i++) {
            if (i % born == 0) {
                population += 1;
            } else if (i % death == 0) {
                population -= 1;
            } else if (i % migrate == 0) {
                population += 1;
            }
        }
        System.out.println(population);
    }
}
