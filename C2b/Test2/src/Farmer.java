import java.util.HashMap;

public class Farmer extends HashMap<Farmer,Zvire> {
    private String nameF;
    private int count = 0;


    public Farmer(String nameF) {
        this.nameF = nameF;
    }

    public String getNameF() {
        return nameF;
    }

    public void setNameF(String nameF) {
        this.nameF = nameF;
    }

    public void add(Farmer zvire){
        if(count >= zvire.size()){

        }
    }
}
