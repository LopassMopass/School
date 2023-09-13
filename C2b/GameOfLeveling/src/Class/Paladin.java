package Class;

public class Paladin extends Body{
    public Paladin(String name, int level, int exp, int armorClass, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        super(name, level, exp, armorClass, strength+2, dexterity, constitution+1, intelligence, wisdom+1, charisma);
    }
    @Override
    public double getAttack() {
        return 3 * strength;
    }

    @Override
    public double getProperties(Body defender) {
        return defender.getStrength();
    }
}
