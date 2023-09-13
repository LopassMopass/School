import java.io.Serializable;
import java.util.ArrayList;

public class Firma implements Serializable {
    private String jmeno;
    private ArrayList<Zamestnanec> zamestnaneci = new ArrayList<>();

    public void add(Zamestnanec zamestnanec){
        zamestnaneci.add(zamestnanec);
    }

    @Override
    public String toString() {
        return zamestnaneci.toString();
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
}
