import java.util.ArrayList;
import java.util.Collections;

public class VysledkovaListina extends ArrayList<Zavodnik> {
    public boolean add(Zavodnik zavodnik){
        for (Zavodnik z : this) {
            if(z.getStartovniCislo() == zavodnik.getStartovniCislo()){
                return false;
            }
        }
        super.add(zavodnik);
        return true;
    }

    public void sort() {
        Collections.sort(this);
    }
}
