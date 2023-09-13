import java.io.Serializable;

public class Zamestnanec implements Serializable  {
    private String jmeno;
    private String prijmeni;
    private int plat;

    public Zamestnanec(String jmeno, String prijmeni, int plat) {
        setJmeno(jmeno);
        setPrijmeni(prijmeni);
        setPlat(plat);
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public int getPlat() {
        return plat;
    }

    public void setPlat(int plat) {
        this.plat = plat;
    }

    @Override
    public String toString() {
        return jmeno+" "+prijmeni+": "+ plat+"Kč";
    }
}
