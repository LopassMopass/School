abstract class CakeDecor implements Cake{
    protected Cake specialCake;

    public CakeDecor(Cake specialCake){
        this.specialCake = specialCake;
    }

    @Override
    public String cake() {
        return specialCake.cake();
    }
}
