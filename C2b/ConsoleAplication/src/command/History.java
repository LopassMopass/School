package command;

import konzole.Konzole;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class History extends Command{
    @Override
    public String execute() {
        ArrayList<String> list = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(Konzole.fileOfCommand))) {
            String line = "";
            while ((line = br.readLine())!=null){
                list.add(line);
            }
            return list.toString();
        }catch (Exception e){
            return "History is not implemented";
        }
    }

    @Override
    public boolean exit() {
        return false;
    }
}
