import java.io.*;

public class Main {
    public static void main(String[] args){
        /*try(FileWriter writer = new FileWriter("soubor.txt",true)) { //Pokud dame do construktoru true, tak se neprepisuje, ale pripisuje
            writer.write("Hello\n");
        } catch (IOException e) {
            System.out.println("Error");
        }

        try {
            zapis("soubor.txt","Hello");
        } catch (IOException e) {
            System.out.println("Error");
        }

        try(FileReader reader = new FileReader("soubor.txt")) {
            int cti = 0;
            while ((cti = reader.read()) != -1){
                System.out.println((char)cti+" ");
            }
        }catch (IOException e){
            System.out.println("Error");
        }


    }
    public static void zapis(String jmenoSouboru, String text) throws IOException { //Kdyby jsme potrebovali udelat statickou metodu v Classe
        FileWriter writer = new FileWriter("soubor.txt",true);
        writer.write(text);
        writer.write("\n");
        writer.close();
    }

    public static int cetnostZnaku(String jmenoSouboru, char znak) throws IOException{
        FileReader reader = new FileReader(jmenoSouboru);
        int cti = 0;
        int current = 0;
        while ((cti = reader.read()) != -1){
            if ((char)cti == znak){
                current++;
            }
        }
        reader.close();
        return current;*/
        Zamestnanec zamestnanec = new Zamestnanec("Jiri","Novak",10000);
        Firma firma = new Firma();
        firma.add(zamestnanec);
        firma.add(new Zamestnanec("Jan","Novak",15000));

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("zamestnanci.dat"))) {
            oos.writeObject(firma);
            //oos.writeObject(new Zamestnanec("Jan","Novak",15000));
        }catch (IOException e){
            System.out.println("Error");
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("zamestnanci.dat"))) {
            Firma firma1 = (Firma)ois.readObject();
            System.out.println(firma1);
        }catch (IOException | ClassNotFoundException e){
            System.out.println("Error");
        }
    }
}
