/**
 * The First class represents the initial graphical user interface (GUI) window of the application.
 * It provides buttons and labels for the user to interact with and navigate the application.
 */
package Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class First extends JFrame implements ActionListener {
    private final JFrame firstFrame;
    private final JButton infoButton, startButton;

    /**
     * Constructor for the First class.
     * It initializes and sets up the GUI components of the first window.
     */
    public First() {
        firstFrame = new JFrame();

        // Load the Owlbear image icon
        java.net.URL imageURL = First.class.getResource("Owlbear.png");
        assert imageURL != null;
        ImageIcon owlbearImage = new ImageIcon(imageURL);

        // Create panels, labels, and buttons for the GUI
        JPanel titlePanel = new JPanel();
        JPanel buttonPanelParent = new JPanel();
        JPanel buttonPanelChild = new JPanel();
        JLabel windowUI = new JLabel();
        startButton = new JButton();
        infoButton = new JButton();

        // Configure panel colors, sizes, and add components
        titlePanel.setBackground(new Color(0, 20, 50));
        titlePanel.setPreferredSize(new Dimension(500, 430));
        titlePanel.add(windowUI);

        // Makes it so that the infoButton has it own space and doesn't collision whit other buttons
        buttonPanelParent.setBackground(new Color(0, 20, 50));
        buttonPanelParent.setOpaque(true);
        buttonPanelParent.setPreferredSize(new Dimension(100, 100));
        buttonPanelParent.add(infoButton);

        // Makes it so that the startButton has it own space and doesn't collision whit other buttons
        buttonPanelChild.setBackground(new Color(0, 20, 50));
        buttonPanelChild.setOpaque(true);
        buttonPanelChild.setPreferredSize(new Dimension(100, 280));
        buttonPanelChild.add(startButton);

        // Configure the firstFrame JFrame
        firstFrame.setLayout(new BorderLayout());
        firstFrame.setIconImage(owlbearImage.getImage());
        firstFrame.setTitle("OwlBear");
        firstFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        firstFrame.setSize(800, 500);
        firstFrame.setLocationRelativeTo(null);
        firstFrame.add(titlePanel, BorderLayout.NORTH);
        firstFrame.add(buttonPanelParent, BorderLayout.CENTER);// Has a big part in space for the infoButton
        firstFrame.add(buttonPanelChild, BorderLayout.SOUTH);// Has a big part in space for the startButton
        firstFrame.setVisible(true);

        // Configure the windowUI label
        windowUI.setText("<html>OwlBear<br/>&<br/>Rodeo<html>");
        windowUI.setForeground(new Color(250, 250, 250));
        windowUI.setFont(new Font("Forte", Font.BOLD, 60));
        windowUI.setIcon(owlbearImage);
        windowUI.setIconTextGap(0);
        windowUI.setHorizontalAlignment(JLabel.CENTER);
        windowUI.setBackground(new Color(0, 20, 50));
        windowUI.setOpaque(true);

        // Configure the infoButton
        infoButton.addActionListener(this);
        infoButton.setText("Getting Started?");
        infoButton.setFocusable(false);
        infoButton.setForeground(new Color(250, 250, 250));
        infoButton.setBackground(new Color(0, 20, 50));
        infoButton.setFont(new Font("Forte", Font.BOLD, 30));
        infoButton.setBorder(BorderFactory.createEmptyBorder());

        infoButton.getModel().addChangeListener(e -> {
            if (infoButton.getModel().isRollover()) {
                infoButton.setForeground(new Color(70, 42, 80));
            } else {
                infoButton.setForeground(new Color(250, 250, 250));
            }
        });

        // Configure the startButton
        startButton.addActionListener(this);
        startButton.setText("Start Game");
        startButton.setFocusable(false);
        startButton.setForeground(new Color(250, 250, 250));
        startButton.setBackground(new Color(0, 20, 50));
        startButton.setFont(new Font("Forte", Font.BOLD, 25));
        startButton.setBorder(new RoundBorder(5));
        startButton.getModel().addChangeListener(e -> {
            if (startButton.getModel().isRollover()) {
                startButton.setForeground(new Color(70, 42, 80));
            } else {
                startButton.setForeground(new Color(250, 250, 250));
            }
        });
    }

    /**
     * Creates a panel containing information about how to get started with the game.
     *
     * @return the panel with the information
     */
    private JPanel getInfoPanel() {
        JPanel infoPanel = new JPanel();
        JLabel infoWindowUI = new JLabel("<html>1. Start the game through the [start button].<br/>" +
                "2. You can then import a map/token and play however you wish.<br/>" +
                "3. There are some other features available. For more detailed information about them, " +
                "please refer to the README.txt file in the downloaded package.<html>");
        infoWindowUI.setForeground(new Color(0, 20, 50));
        infoWindowUI.setFont(new Font("", Font.PLAIN, 15));
        infoPanel.add(infoWindowUI);

        return infoPanel;
    }

    /**
     * Handles the action events generated by the buttons.
     *
     * @param e the action event
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == infoButton) {
            JOptionPane.showMessageDialog(null, getInfoPanel(), "Getting Started", JOptionPane.PLAIN_MESSAGE);
        } else if (e.getSource() == startButton) {
            firstFrame.dispose();
            Second secondFrame = new Second();
        }
    }
}
