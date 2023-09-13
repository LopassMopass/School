public class ChocolateDecor extends CakeDecor{
    public ChocolateDecor(Cake specialCake) {
        super(specialCake);
    }

    public String cake(){
        return specialCake.cake() + addChocolate();
    }

    private String addChocolate(){
        return " whit milk chocolate";
    }
}
