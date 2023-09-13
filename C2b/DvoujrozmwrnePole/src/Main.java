import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Cuboit<Integer> c = new Cuboit<>(5,5,6);
        Cuboit<Float> cF = new Cuboit<>(5f,5f,6f);
        Random rnd = new Random();
        int[][] pole = new int[4][4];
        for (int i = 0; i < pole.length; i++) {
            int tmpR = 0;
            for (int j = 0; j < pole[i].length; j++) {
                pole[i][j] = rnd.nextInt(41) - 20;
                tmpR += pole[i][j];
                System.out.format("%4d", pole[i][j]);
            }
            System.out.format(" | %5d%n", tmpR);
        }

        for (int i = 0; i < pole.length; i++) {
            int tmpS = 0;
            for (int j = 0; j < pole[i].length; j++) {
                pole[i][j] = rnd.nextInt(41) - 20;
                tmpS += pole[j][i];
            }
            System.out.format("%4d", tmpS);
        }

    }
}