package UI;

import java.time.LocalDate;
import java.util.ArrayList;

public class Kontakty {
    private ArrayList<Kontakt> kontakty = new ArrayList<>();

    public void add(Kontakt kontakt){
        kontakty.add(kontakt);
    }
    //Zde nevim, jak to mam udelat, aby uzivatel zadaval postupne Name, sureName atd., a proto je to jako jeden text
    public void add(String text){
        kontakty.add(new Kontakt(text, text, text, text, text));
    }

    public  Kontakt get(int index){
        return kontakty.get(index);
    }

    @Override
    public String toString() {
        return kontakty.toString();
    }
}
