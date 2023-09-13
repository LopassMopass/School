import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Trojuhelnik> hset = new HashSet<>();
        Trojuhelnik troj = Trojuhelnik.create(4,3,5);
        hset.add(troj);
    }
}