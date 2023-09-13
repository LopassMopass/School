package Class;

public class Bard extends Body{
    public Bard(String name, int level, int exp, int armorClass, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        super(name, level, exp, armorClass, strength, dexterity+1, constitution, intelligence+1, wisdom, charisma+2);
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
