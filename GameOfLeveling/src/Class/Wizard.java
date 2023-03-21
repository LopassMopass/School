package Class;

public class Wizard extends Body{
    public Wizard(String name, int level, int exp, int armorClass, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        super(name, level, exp, armorClass, strength, dexterity, constitution, intelligence+4, wisdom+2, charisma);
    }
    @Override
    public double getAttack() {
        return 3 * intelligence;
    }

    @Override
    public double getProperties(Body defender) {
        return defender.getIntelligence();
    }
}
