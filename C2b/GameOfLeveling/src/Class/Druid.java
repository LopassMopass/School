package Class;

public class Druid extends Body{
    public Druid(String name, int level, int exp, int armorClass, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        super(name, level, exp, armorClass, strength, dexterity, constitution, intelligence+1, wisdom+2, charisma);
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
