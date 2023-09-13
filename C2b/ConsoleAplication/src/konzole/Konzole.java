package konzole;

import command.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Scanner;

public class Konzole {
    private boolean exit = false;
    private HashMap<String, Command> map = new HashMap<>();
    public static String fileOfCommand = "commands.txt";

    public void inicialization() {
        map.put("help", new Help());
        map.put("exit", new Exit());
        map.put("history", new History());
        map.put("quote", new Quote());
        map.put("Equation", new QuadraticEquation());
    }

    public void start() {
        inicialization();
        try {
            cleanCommand();
            do {
                method();
            } while (!exit);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private Scanner sc = new Scanner(System.in);

    private void method() {
        System.out.print(">>");
        String command = sc.nextLine();
        command = command.trim();
        command = command.toLowerCase();
        if (map.containsKey(command)) {
            saveCommand(command);// ulozi jen smyslne prikazi
            System.out.println(">> " + map.get(command).execute());
            exit = map.get(command).exit();
        } else {
            System.out.println(">> Not Command");
        }
    }

    private void saveCommand(String command) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileOfCommand, true))) {
            bw.write(command);
            bw.newLine();
        } catch (Exception e) {

        }
    }

    private void cleanCommand() {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileOfCommand, false))) {
        } catch (Exception e) {

        }
    }
}

