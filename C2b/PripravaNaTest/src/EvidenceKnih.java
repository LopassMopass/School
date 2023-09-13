import java.util.ArrayList;

public class EvidenceKnih extends ArrayList<EvidenceKnih> {
    private String nazev;
    private int cena;
    private String autor;


    public EvidenceKnih(String nazev, int cena, String autor) {
        setNazev(nazev);
        setCena(cena);
        setAutor(autor);
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public static int celkovaCena(int cena, ArrayList<EvidenceKnih> array){
        int celkovaC = 0;
        while(cena < array.size()){
            celkovaC+= cena;
        }
        return celkovaC;
    }



}
