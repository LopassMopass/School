package UI;

import java.util.Scanner;

public class MenuItemUpdate extends MenuItem{
    private Scanner sc = new Scanner(System.in);
    public MenuItemUpdate(String description, Kontakty kontakty) {
        super(description, kontakty);
    }

    @Override
    public boolean execute() {
        System.out.println("Zadej kontakt: ");
        String kontakte = sc.nextLine();
        kontakty.add(kontakte);
        return false;
    }
}
