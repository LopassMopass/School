package UI;


public class MenuItemAdd extends MenuItem{

    public MenuItemAdd(String description, Kontakty kontakty) {
        super(description,kontakty);
    }

    @Override
    public boolean execute() {
        System.out.println(kontakty.toString());
        return false;
    }
}
