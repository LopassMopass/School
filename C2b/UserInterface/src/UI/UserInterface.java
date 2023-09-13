package UI;

import java.util.Scanner;

public class UserInterface {
    Scanner sc = new Scanner(System.in);
    public void start() {
        try {
            Kontakty kontakty = new Kontakty();
            MainMenu(kontakty);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("END");
    }
    private boolean exit = false;

    public void MainMenu(Kontakty kontakty) {
        Menu menu = new Menu("Select one option: ");
        menu.add(new MenuItemAdd("Insert info",kontakty));
        menu.add(new MenuItemUpdate("Update info", kontakty));
        menu.add(new MenuItemDelete("Delete info", kontakty));
        menu.add(new MenuItemEnd("End"));
        while (!exit) {
            MenuItem item = menu.execute();
            exit = item.execute();
        }
    }
}
