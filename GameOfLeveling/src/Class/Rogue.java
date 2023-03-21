package Class;

public class Rogue extends Body{
    public Rogue(String name, int level, int exp, int armorClass, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        super(name, level, exp, armorClass, strength, dexterity+4, constitution, intelligence, wisdom+2, charisma);
    }
    @Override
    public double getAttack() {
        return 3 * dexterity;
    }

    @Override
    public double getProperties(Body defender) {
        return defender.getDexterity();
    }
}
