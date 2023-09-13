public class NutDecor extends CakeDecor{

    public NutDecor(Cake specialCake) {
        super(specialCake);
    }

    public String cake(){
        return specialCake.cake() + addNut();
    }

    private String addNut(){
        return " whit crunchy Nut";
    }
}
