import java.util.Objects;

public class EvidenceAut implements Comparable<EvidenceAut>{
    private String SPZ;
    private String znacka;
    private String jmeno;

    public EvidenceAut(String SPZ, String znacka, String jmeno) {
        setSPZ(SPZ);
        setZnacka(znacka);
        setJmeno(jmeno);
    }

    public String getSPZ() {
        return SPZ;
    }

    public void setSPZ(String SPZ) {
        if(SPZ.matches("^(\\d[A-Z]\\d[-|\\s]\\d{4})$")){
            this.SPZ = SPZ;
        }else {
            throw new IllegalArgumentException("Invalid SPZ");
        }
    }

    public String getZnacka() {
        return znacka;
    }

    public void setZnacka(String znacka) {
        this.znacka = znacka;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    @Override
    public int compareTo(EvidenceAut o) {
        return this.getJmeno().compareTo(o.getJmeno());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EvidenceAut evidenceAut = (EvidenceAut) o;
        return SPZ.equals(evidenceAut.SPZ);
    }

    @Override
    public int hashCode() {
        return Objects.hash(SPZ);
    }

    @Override
    public String toString() {
        return "Auto:"+" SPZ["+SPZ+"]"+"Znacka{"+znacka+"}"+"JmenoMajitele("+jmeno+")" ;
    }
}
