package UI;

public class MenuItemEnd extends MenuItem{
    public MenuItemEnd(String description) {
        super(description, null);
    }

    @Override
    public boolean execute() {
        return true;
    }
}
