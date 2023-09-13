package Class;

import Race.*;

import java.util.Scanner;

public abstract class Body {
    protected String name;
    public int level;
    public int exp;
    public int armorClass;
    public int strength;
    public int dexterity;
    public int constitution;
    public int intelligence;
    public int wisdom;
    public int charisma;
    public IRace race;

    public String getName(){
        return name;
    }
    public int getLevel(){
        return level;
    }
    public int getExp(){
        return exp;
    }
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
    public IRace getRace(IRace race){
        return race;
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

    public static Body createClass(String name, int level, int exp, int armorClass, int strength, int dexterity,
                                   int constitution, int intelligence, int wisdom, int charisma){
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------- Choose your class -------------- \n 1. Barbarian \n 2. Bard \n 3. Cleric \n 4. Druid \n 5. Fighter \n 6. Monk " +
                           "\n 7. Paladin \n 8. Ranger \n 9. Rogue \n 10. Sorcerer \n 11. Warlock \n 12. Wizard \n Use the numbers of the classes to select them 1,2,3...: \n");
        int type = sc.nextInt();
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

    public static IRace createRace(int bonusStrength, int bonusDexterity, int bonusConstitution, int bonusIntelligence, int bonusWisdom, int bonusCharisma){
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------- Choose your race -------------- \n 1. Dragonborn \n 2. Dwarf \n 3. Elf \n 4. Gnome \n 5. Half-elf \n 6. Half-ling " +
                           "\n 7. Half-Orc \n 8. Human \n 9. Tie-fling \n Use the numbers of the races to select them 1,2,3...: \n");
        int type = sc.nextInt();
        switch (type){
            case 1: return new Dragonborn();
            case 2: return new Dwarf();
            case 3: return new Elf();
            case 4: return new Gnome();
            case 5: return new HalfElf();
            case 6: return new Halfling();
            case 7: return new HalfOrc();
            case 8: return new Human();
            case 9: return new Tiefling();
            default: throw new RuntimeException("Invalid type!");
        }
    }
    public int distributePoints(){
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------- Distribute you points -------------- \n 1. Strength +2 \n 2. Dexterity +2 \n 3. Constitution +2 " +
                           "\n 4. Intelligence +2 \n 5. Wisdom +2 \n 6. Charisma +2 \n");
        System.out.println("You have got a 2 points to spend (can only choice one attribute), choose wisely (use the numbers of the skills to select them 1,2,3...): \n");
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
    public abstract double getAttack();
    public abstract double getProperties(Body defender);
    public int getHealth(){
        int HP = (int)getConstitution();
        return HP * level * 10;
    }
    public boolean victory(Body enemy){
        if (enemy.getHealth() <= 0){
            return true;
        }else return false;
    }
    public boolean isAlive(){
        return (getHealth() > 0);
    }
    public void getLevelUp(){
        while(exp >= 100*level){
            exp -= 100*level;
            level++;
        }
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
