package Class;

import Race.IRace;

import java.util.Scanner;

public abstract class Body {
    protected String name;
    protected int level;
    protected int exp;
    protected int armorClass;
    protected int strength;
    protected int dexterity;
    protected int constitution;
    protected int intelligence;
    protected int wisdom;
    protected int charisma;
    protected IRace race;

    public int getStrength(){
        return (int)(strength*race.bonusStrength());
    }
    public int getDexterity(){
        return (int)(dexterity*race.bonusDexterity());
    }
    public int getConstitution(){
        return (int)(constitution*race.bonusConstitution());
    }
    public int getIntelligence(){
        return (int)(intelligence*race.bonusIntelligence());
    }
    public int getWisdom(){
        return (int)(wisdom*race.bonusWisdom());
    }
    public int getCharisma(){
        return (int)(charisma*race.bonusCharisma());
    }
    public int getArmorClass(){
        return (int)(armorClass*race.bonusDexterity());
    }

    public void setRace(IRace race){
        this.race = race;
    }

    public Body(String name, int level, int exp, int armorClass, int strength,
                int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        this.name = name;
        this.level = level;
        this.exp = exp;
        this.armorClass = armorClass;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    public Body(String name, int armorClass, int strength, int dexterity,
                int constitution, int intelligence, int wisdom, int charisma) {
        this.name = name;
        this.level = 1;
        this.exp = 0;
        this.armorClass = armorClass;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    public static  Body createClass(String name, int level, int exp, int armorClass, int strength, int dexterity,
                                   int constitution, int intelligence, int wisdom, int charisma, int type){
        switch (type){
            case 1: return new Barbarian(name, 1, 0, 5,strength, dexterity, constitution, intelligence, wisdom, charisma);
            case 2: return new Bard(name, 1, 0, 1,strength, dexterity, constitution, intelligence, wisdom, charisma);
            case 3: return new Cleric(name, 1, 0, 1,strength, dexterity, constitution, intelligence, wisdom, charisma);
            case 4: return new Druid(name, 1, 0, 3,strength, dexterity, constitution, intelligence, wisdom, charisma);
            case 5: return new Fighter(name, 1, 0, 4,strength, dexterity, constitution, intelligence, wisdom, charisma);
            case 6: return new Monk(name, 1, 0, 4,strength, dexterity, constitution, intelligence, wisdom, charisma);
            case 7: return new Paladin(name, 1, 0, 4,strength, dexterity, constitution, intelligence, wisdom, charisma);
            case 8: return new Ranger(name, 1, 0, 2,strength, dexterity, constitution, intelligence, wisdom, charisma);
            case 9: return new Rogue(name, 1, 0, 3,strength, dexterity, constitution, intelligence, wisdom, charisma);
            case 10: return new Sorcerer(name, 1, 0, 1,strength, dexterity, constitution, intelligence, wisdom, charisma);
            case 11: return new Warlock(name, 1, 0, 2,strength, dexterity, constitution, intelligence, wisdom, charisma);
            case 12: return new Wizard(name, 1, 0, 1,strength, dexterity, constitution, intelligence, wisdom, charisma);
            default: throw new RuntimeException("Invalid type!");
        }
    }

    public abstract double getAttack();
    public abstract double getProperties(Body defender);
    public int getHealth(){
        int HP = (int)getConstitution();
        return HP * level * 10;
    }
    public int distributePoints(){
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------- Distribute you points -------------- \n");
        System.out.println("You have got a 2 points to spend (can only choice one attribute), choose wisely: \n");
        int type = sc.nextInt();
        switch (type){
            case 1: return getStrength()+2;
            case 2: return getDexterity()+2;
            case 3: return getConstitution()+2;
            case 4: return getIntelligence()+2;
            case 5: return getWisdom()+2;
            case 6: return getCharisma()+2;
            default: throw new RuntimeException("Invalid type!");
        }
    }
    public boolean victory(Body enemy){
        if (enemy.getHealth() <= 0){
            return true;
        }else return false;
    }
    public boolean isAlive(){
        return (getHealth() > 0);
    }
    public int getLevelUp(){
        while(exp >= 100*level){
            exp -= 100*level;
            level++;
        }
        return level;//Nevim co presne chci vratit, ZEPTAT SE!
    }
    public int getArmorClass(Body enemy) {
        return (int)getArmorClass() + (int)enemy.getProperties(this);
    }
    public int getHit(Body defender){
        return (int)getAttack() - defender.getArmorClass(this);
    }
    public int currentHP(Body defender){
        return getHealth() - defender.getHit(this);
    }
}
