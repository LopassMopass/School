package UI;

public class MenuItemDelete extends MenuItem{

    public MenuItemDelete(String description, Kontakty kontakty) {
        super(description, kontakty);
    }

    @Override
    public boolean execute() {
        kontakty = null;
        return false;
    }
}
