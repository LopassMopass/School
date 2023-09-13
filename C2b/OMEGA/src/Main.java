/**
 * The Main class is the entry point of the application.
 * It initializes and runs the graphical user interface (GUI) by creating an instance of the First class.
 */
import java.awt.*;
import Window.*;

public class Main {
    /**
     * The main method is the starting point of the application.
     * It invokes the GUI initialization and runs it within the Event Dispatch Thread (EDT).
     *
     * @param args command-line arguments (not used in this application)
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                new First(); // Create an instance of the First class to initialize and run the GUI.
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
