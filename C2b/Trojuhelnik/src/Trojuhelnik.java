import java.util.HashSet;
import java.util.Objects;

public class Trojuhelnik {
    private int a;
    private int b;
    private int c;

    public static Trojuhelnik create(int a, int b, int c) {
        if (a > b) {
            int pomoc = a;
            a = b;
            b = pomoc;
        }
        if (b > c) {
            int pomoc = b;
            b = c;
            c = pomoc;
            if (a > b) {
                pomoc = a;
                a = b;
                b = pomoc;
            }
        }
        if (a + b > c) {
            return new Trojuhelnik(a, b, c);
        }
        return null;
        //throw new RuntimeException("Try again!");
    }
    public Trojuhelnik(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) throws Exception {
        if (a < 0) {
            throw new Exception("Try again!");
        }
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) throws Exception {
        if (b < 0) {
            throw new Exception("Try again!");
        }
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) throws Exception {
        if (c < 0) {
            throw new Exception("Try again!");
        }
        this.c = c;
    }

    @Override
    public String toString() {
        return String.format("%d, %d, %d", a, b, c);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trojuhelnik that = (Trojuhelnik) o;
        return a == that.a && b == that.b && c == that.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    /*public static void Checker(int a, int b, int c) throws Exception {
        if (a + b > c || a + c > b || b + c > a) {
            return;//Dokoncit
        } else {
            throw new Exception("Try again!");
        }
    }*/
}

