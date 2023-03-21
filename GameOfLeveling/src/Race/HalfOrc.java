package Race;

public class HalfOrc implements IRace{
    @Override
    public double bonusStrength() {
        return 1.3;
    }

    @Override
    public double bonusDexterity() {
        return 1;
    }

    @Override
    public double bonusConstitution() {
        return 1.1;
    }

    @Override
    public double bonusIntelligence() {
        return 0.95;
    }

    @Override
    public double bonusWisdom() {
        return 0.95;
    }

    @Override
    public double bonusCharisma() {
        return 1;
    }

    @Override
    public String getRace() {
        return "Half-Orc";
    }
}
