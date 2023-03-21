package Race;

public class Halfling implements IRace{
    @Override
    public double bonusStrength() {
        return 1;
    }

    @Override
    public double bonusDexterity() {
        return 1.05;
    }

    @Override
    public double bonusConstitution() {
        return 1;
    }

    @Override
    public double bonusIntelligence() {
        return 1.05;
    }

    @Override
    public double bonusWisdom() {
        return 1.2;
    }

    @Override
    public double bonusCharisma() {
        return 1.1;
    }

    @Override
    public String getRace() {
        return "Halfling";
    }
}