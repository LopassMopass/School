import java.util.HashMap;

public class RidkaMatice<T extends Number & Comparable<T>>{
    private int pocetRadku;
    private int pocetSloupcu;
    private HashMap<Matice,T> mapa = new HashMap<>();

    public RidkaMatice(int pocetRadku, int pocetSloupcu) {
        if(pocetRadku < 1 || pocetSloupcu < 1){
            throw new RuntimeException("Matici nelze vytvorit");
        }
        this.pocetRadku = pocetRadku;
        this.pocetSloupcu = pocetSloupcu;
    }

    public void prvek(int radek, int sloupec, T prvek){
        if(radek < 1 || radek > pocetSloupcu || sloupec < 1 || sloupec > pocetRadku){
            throw new IndexOutOfBoundsException();
        }
        Matice matice = new Matice(radek,sloupec);
        if(!mapa.containsKey(matice)){
            mapa.put(matice,prvek);
        }else {
            mapa.replace(matice,prvek);
        }
    }

    public T getHodnota(int radek, int sloupec) {
        if (radek < 1 || radek > pocetSloupcu || sloupec < 1 || sloupec > pocetRadku) {
            throw new IndexOutOfBoundsException();
        }
        Matice matice = new Matice(radek,sloupec);
        if(mapa.containsKey(matice)){
            return mapa.get(matice);
        }
        return null;
    }

    public int pocetNenulovych(){
        return mapa.size();
    }

    public int pocetNulovych(){
        return pocetSloupcu * pocetRadku - mapa.size();
    }
}
