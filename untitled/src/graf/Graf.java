package graf;

import java.util.Arrays;
import java.util.TreeSet;

public class Graf {
    private TreeSet<Integer>[] grafik;
    private String[] oznaceniVrcholu = null;

    public void inicializujOznaceniVrcholu(String[] pole){
        if(pole.length != grafik.length){
            throw new RuntimeException("Oznaceni vrcholu neodpovida jejich poctu");
        }
        /*
        Melka kopie
        oznaceniVrcholu = pole;
        */
        oznaceniVrcholu = new String[grafik.length];
        for(int i = 0; i < grafik.length; i++){
            oznaceniVrcholu[i] = pole[i];
        }
    }

    public String vypisGrafu() {
        if(oznaceniVrcholu == null) return this.toString();
        String vypis = "";
        for(int i = 0; i < grafik.length; i++){
            vypis += oznaceniVrcholu[i] + " -> ";
            for(int v : grafik[i]){
                vypis += oznaceniVrcholu[v]+",";
            }
            vypis += "\n";
        }
        return vypis;
    }

    public Graf(int pocetVrcholu){
        grafik = new TreeSet[pocetVrcholu];
        for(int i = 0; i < grafik.length; i++){
            grafik[i] = new TreeSet<>();
        }
    }

    /**
     * Metoda pro pridani hrany
     * @param vrchol1 pocatecni vrchol, ktery hranu tvori
     * @param vrchol2 koncovy vrchol, ktery tvori hranu
     * @param neorientovny true pro neorientovanou hranu, false pro orientovanou hranu
     */
    public void pridejHranu(int vrchol1, int vrchol2, boolean neorientovny){
        if(vrchol1 < 0 || vrchol1 >= grafik.length){
            throw new VrcholException();
        }
        if(vrchol2 < 0 || vrchol2 >= grafik.length){
            throw new VrcholException();
        }
        grafik[vrchol1].add(vrchol2);
        if(neorientovny) {grafik[vrchol2].add(vrchol1);}
    }

    public int[][] maticeSousednosti(){
        int[][] matice = new int[grafik.length][grafik.length];
        for(int i = 0; i < grafik.length; i++){
            for(int j = 0; j < grafik.length; j++){
                if(grafik[i].contains(j)){
                    matice[i][j] = 1;
                }else{
                    matice[i][j] = 0;
                }
            }
        }
        return matice;
    }

    @Override
    public String toString() {
        String vypis = "";
        for(int i = 0; i < grafik.length; i++){
            vypis += i + " -> ";
            for(int v : grafik[i]){
                vypis += v+",";
            }
            vypis += "\n";
        }
        return vypis;
    }
}
