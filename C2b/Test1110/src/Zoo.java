import java.util.ArrayList;

public class Zoo {
    private String zvire;
    private String zahrada;

    public String getZahrada() {
        return zahrada;
    }

    public void setZahrada(String zahrada) {
        this.zahrada = zahrada;
    }

    public String getZvire() {
        return zvire;
    }

    public void setZvire(String zvire) {
        this.zvire = zvire;
    }

    public Zoo(String zvire) {
        this.zvire = zvire;
    }

    public String toString() {
        return  "(" +zvire+ ")";
    }

    /*private ArrayList<Zoo> zoo = new ArrayList<Zoo>();

    public void add(Zoo z){
        zoo.add(z);
    }*/


}
