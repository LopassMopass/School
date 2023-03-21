import graf.Graf;

public class Main {
    public static void main(String[] args) {

        Graf mujGraf = new Graf(4);
        mujGraf.pridejHranu(0,1,true);
        mujGraf.pridejHranu(0,2,true);
        mujGraf.pridejHranu(1,2,true);
        mujGraf.pridejHranu(2,3,true);

        int[][] matice = mujGraf.maticeSousednosti();
        vypisMatici(matice);
        System.out.println();
        System.out.println(mujGraf);
        System.out.println();

        String[] mesta = {"Pisek", "Plzen", "Praha", "Brno"};
        mujGraf.inicializujOznaceniVrcholu(mesta);
        System.out.println(mujGraf.vypisGrafu());
    }

    public static void vypisMatici(int[][] matice){
        for(int i = 0; i < matice.length; i++){
            for(int j = 0; j < matice.length; j++){
                System.out.print(matice[i][j]+" ");
            }
            System.out.println();
        }
    }
}