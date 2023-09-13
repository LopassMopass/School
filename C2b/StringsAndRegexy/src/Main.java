public class Main {
    public static void main(String[] args) {
         String textik = "promena";

        /*if(jePromenna(textik)){
            System.out.println("je promenna");
        } else{
            System.out.print("neni promena");
        }*/

    }
    public static boolean jeP(String text){
        return text.matches("^[a-z][a-zA-Z0-9]*$");
    }

    public static boolean jeRC(String text2){
        return text2.matches("^0x[0-9A-F]+$");
    }

}

