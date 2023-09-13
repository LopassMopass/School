import java.util.Objects;

public class Matice {
    private int radek;
    private int sloupec;

    public Matice(int radek, int sloupec) {
        this.radek = radek;
        this.sloupec = sloupec;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matice matice = (Matice) o;
        return radek == matice.radek && sloupec == matice.sloupec;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radek, sloupec);
    }
}
