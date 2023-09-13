import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.TreeSet;
import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] array = new int[20];
        LinkedList<Integer> lList = new LinkedList<>();
        HashSet<Integer> hSet = new HashSet<>();
        TreeSet<Integer> tSet = new TreeSet<>();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(11) - 5;
            System.out.print(array[i]+" ");
        }
            for(int x : array){
                hSet.add(x);
                tSet.add(x);
                lList.add(x);
            }

            for(int x : array) {
                System.out.print(x+" ");
            }

            for (int x: array) {
                System.out.print(x+" ");
            }

            for(int x : array){
                System.out.print(x+" ");
            }
            /*list.add(array[i]);
            System.out.print(array[i] + " ");*/

        }
    }


       /* String textik = "promena";

        if(jePromenna(textik)){
            System.out.println("je promenna");
        } else{
            System.out.print("neni promena");
        }

    }
    public static boolean jeP(String text){
        return text.matches("^[a-z][a-zA-Z0-9]*$");
    }

    public static boolean jeCC(String text1){
        return text1.matches("^[]+$");
    }

    public static boolean jeRC(String text2){
        return text2.matches("^0x[0-9A-F]+$");
    }*/

