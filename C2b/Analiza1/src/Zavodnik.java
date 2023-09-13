import java.time.LocalTime;

public class Zavodnik implements Comparable<Zavodnik> {
    private String jmeno;
    private String prijmeni;
    private int startovniCislo;
    private LocalTime time;

    @Override
    public int compareTo(Zavodnik o){
        return this.time.compareTo(o.time);
    }

    public Zavodnik(String jmeno, String prijmeni, int startovniCislo, LocalTime time) {
        this.setJmeno(jmeno);
        this.setPrijmeni(prijmeni);
        this.setStartovniCislo(startovniCislo);
        this.setTime(time);
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public int getStartovniCislo() {
        return startovniCislo;
    }

    public void setStartovniCislo(int startovniCislo) {
        this.startovniCislo = startovniCislo;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Zavodnik:"+jmeno+" "+prijmeni+" [Startovni cislo] => "+startovniCislo+". ";
    }
}
