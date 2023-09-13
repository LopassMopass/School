import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
    int pocet = 0;
    System.out.println("Zhrada Zoo: ");
        Zoo z1 = new Zoo("Kure");
        Zoo z2 = new Zoo("Zebra");
        Zoo z3 = new Zoo("Lev");
        Zoo z4 = new Zoo("Mroz");
        Zoo z5 = new Zoo("Tyger");

        ArrayList<Zoo> zoo = new ArrayList<Zoo>();
        zoo.add(z1);
        zoo.add(z2);
        zoo.add(z3);
        zoo.add(z4);
        zoo.add(z5);
        pocet = 5;

        System.out.print("Pocet zvirat je: "+pocet);
    }
}
