import java.time.LocalTime;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();

        LocalTime time = LocalTime.of(0, rnd.nextInt(3), rnd.nextInt(59));



    }
}
