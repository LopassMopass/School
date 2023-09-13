import java.util.HashMap;

public class Aquarist extends HashMap<String,String>{
    private String jmeno;
    private String druh;
    private String voda;

    public Aquarist(String jmeno, String druh, String voda) {
        setJmeno(jmeno);
        setDruh(druh);
        setVoda(voda);
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getDruh() {
        return druh;
    }

    public void setDruh(String druh) {
        this.druh = druh;
    }

    public String getVoda() {
        return voda;
    }

    public void setVoda(String voda) {
        this.voda = voda;
    }

    @Override
    public String toString() {
        return "Aquarist: "+jmeno+" ";
    }
}
