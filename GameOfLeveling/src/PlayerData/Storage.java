package PlayerData;

import Race.IRace;

import java.io.Serializable;

public class Storage implements Serializable{
    String name;
    int level;
    int exp;
    int armorClass;
    int strength;
    int dexterity;
    int constitution;
    int intelligence;
    int wisdom;
    int charisma;
    IRace race;
}
