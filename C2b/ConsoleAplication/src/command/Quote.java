package command;

import konzole.Konzole;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

public class Quote extends Command{

    @Override
    public String execute() {
        ArrayList<String> list = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("quotes.txt"))) {
            String line = "";
            while ((line = br.readLine())!=null){
                list.add(line);
            }
            Random rnd = new Random();
            return  list.get(rnd.nextInt(list.size()));
        }catch (Exception e){
            return "Quote not implemented";
        }
    }

    @Override
    public boolean exit() {
        return false;
    }
}
