package Class;

public class Fighter extends Body{
    public Fighter(String name, int level, int exp, int armorClass, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        super(name, level, exp, armorClass, strength+2, dexterity+2, constitution+1, intelligence, wisdom, charisma);
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
