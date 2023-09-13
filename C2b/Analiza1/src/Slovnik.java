import java.util.ArrayList;

public class Slovnik {
    private ArrayList<String> listCZ;
    private ArrayList<String> listEN;
    private ArrayList<Dvojce> dvojce;

    public Slovnik(){
        listCZ = new ArrayList<>();
        listEN = new ArrayList<>();
        dvojce = new ArrayList<>();
    }
    public void addSlovicko(String cz, String en){
        int indexCZ = 0;
        boolean nalezeno = false;
        for (String s : listCZ) {
            if(s.equals(cz)){
                nalezeno = true;
                break;
            }
            indexCZ++;
        }
        if(!nalezeno){
            listCZ.add(cz);
            indexCZ = listCZ.size() - 1;
        }

        int indexEN = 0;
        nalezeno = false;
        for (String s : listEN) {
            if(s.equals(en)){
                nalezeno = true;
                break;
            }
            indexEN++;
        }
        if(!nalezeno){
            listEN.add(en);
            indexEN = listEN.size() - 1;
        }

    }

}

