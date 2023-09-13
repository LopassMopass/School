import java.util.ArrayList;
import java.util.Iterator;

public class Firma implements Iterable<Zamestnanec> { //Aby kolekce mohla pouzit interator
    ArrayList<Zamestnanec> zamestnaneci = new ArrayList<>();

    public void addZamestnanec(Zamestnanec zamestnanec){
        zamestnaneci.add(zamestnanec);
    }

    @Override
    public Iterator<Zamestnanec> iterator() {
        return zamestnaneci.iterator();
    }
}
