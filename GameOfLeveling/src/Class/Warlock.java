package Class;

public class Warlock extends Body{
    public Warlock(String name, int level, int exp, int armorClass, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        super(name, level, exp, armorClass, strength, dexterity, constitution+2, intelligence, wisdom, charisma+4);
    }
    @Override
    public double getAttack() {
        return 3 * charisma;
    }

    @Override
    public double getProperties(Body defender) {
        return defender.getCharisma();
    }
}
