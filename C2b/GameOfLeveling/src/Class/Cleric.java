package Class;

public class Cleric extends Body{
    public Cleric(String name, int level, int exp, int armorClass, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        super(name, level, exp, armorClass, strength, dexterity, constitution, intelligence+1, wisdom+3, charisma+1);
    }
    @Override
    public double getAttack() {
        return 3 * wisdom;
    }

    @Override
    public double getProperties(Body defender) {
        return defender.getWisdom();
    }
}
