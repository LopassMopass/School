

public class Osoba {
    private String jmeno;
    private String prijmeni;
    private Osoba rodneCislo;

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) throws Exception {
        if (!jmeno.matches("")) {
            throw new Exception(jmeno + "Nemuze byt jmeno");

        }
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) throws Exception {
        if (!prijmeni.matches("")) {
            throw new Exception(prijmeni + "Nemuze byt prijmeni");
        }
        this.prijmeni = prijmeni;
    }

    public Osoba(String jmeno, String prijmeni, RodneCislo rodneCislo) throws Exception {
        this.setJmeno(jmeno);
        this.setPrijmeni(prijmeni);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return this.rodneCislo.equals(osoba.rodneCislo);
    }

    /*@Override
    public int hashCode() {
        return Object.hash(rodneCislo);
    }*/

    @Override
    public String toString() {
        return "Osoba:"+ jmeno + " " + prijmeni + "\nRodne cislo:";
    }
}
