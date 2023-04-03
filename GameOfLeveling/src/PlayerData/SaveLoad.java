package PlayerData;
import Class.*;

import java.io.*;

public class SaveLoad {
    Body b;

    public SaveLoad(Body b){
        this.b = b;
    }

    public void save(){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("player.dat")));
            Storage s = new Storage();

            s.name = b.getName();
            s.level = b.getLevel();
            s.exp = b.getExp();
            s.strength = b.getStrength();
            s.dexterity = b.getDexterity();
            s.constitution = b.getConstitution();
            s.intelligence = b.getIntelligence();
            s.wisdom = b.getWisdom();
            s.charisma = b.getCharisma();
            s.armorClass = b.getArmorClass();
            s.race = b.getRace(null);

            oos.writeObject(s);
        }catch (Exception e){
            System.out.println("Save Error!");
        }
    }

    public void load(){
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("player.dat")));
            Storage s = (Storage)ois.readObject();

            b.getName().replace(b.getName(), s.name);
            b.level = s.level;
            b.exp = s.exp;
            b.strength = s.strength;
            b.dexterity = s.dexterity;
            b.constitution = s.constitution;
            b.intelligence = s.intelligence;
            b.wisdom = s.wisdom;
            b.charisma = s.charisma;
            b.armorClass = s.armorClass;

        }catch (Exception e){
            System.out.println("Load Error!");
        }
    }
}
