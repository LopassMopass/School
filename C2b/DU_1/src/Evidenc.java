import java.util.ArrayList;
import java.util.Collections;

public class Evidenc extends ArrayList<Log> {

   @Override
    public boolean add(Log log) {
        for (Log l : this) {
            if (l.getID() == log.getID()) {
                return false;
            }
        }
        super.add(log);
        return true;
    }

    public void sort(){
        Collections.sort(this);
    }
}
