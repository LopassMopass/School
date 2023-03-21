package UI;

public abstract class MenuItem{
    protected String description;
    protected Kontakty kontakty;

    public MenuItem(String description, Kontakty kontakty) {
        this.description = description;
        this.kontakty = kontakty;
    }

    public String toString() {
        return description;
    }

    public abstract boolean execute();
}

