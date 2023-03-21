package Class;

public class Barbarian extends Body{

    public Barbarian(String name, int level, int exp, int armorClass, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        super(name, level, exp, armorClass, strength+3, dexterity+1, constitution+2, intelligence, wisdom, charisma);
    }

    @Override
    public double getAttack() {
        return 3 * strength;
    }

    public double getProperties(Body defender){
        return defender.getStrength();
    }
}
