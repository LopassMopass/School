/**
 * The Second class represents a graphical user interface (GUI) window
 * for an application called "Rodeo". It allows the user to import a map
 * and tokens, and provides a help menu with instructions.
 */
package Window;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Second extends JFrame implements ActionListener {
    private JFrame secondFrame;
    private ArrayList<JLabel> arrayOfLabels;
    private JLabel tokenLabel;
    private JMenuBar menuBar;
    private JMenu mapMenu, tokenMenu, helpMenu;
    private JMenuItem importMap, importTokens, helpItem;
    private ImageIcon owlbearIcon;

    /**
     * Initializes the Second object by setting up the components,
     * creating the menus, and creating the main frame.
     */
    public Second() {
        initializeComponents();
        createMenus();
        createFrame();
    }

    /**
     * Initializes the GUI components, including frames, labels, and icons.
     */
    private void initializeComponents() {
        secondFrame = new JFrame();
        tokenLabel = new JLabel();
        arrayOfLabels = new ArrayList<>();
        menuBar = new JMenuBar();
        mapMenu = new JMenu("Map");
        tokenMenu = new JMenu("Tokens");
        helpMenu = new JMenu("Help");
        importMap = new JMenuItem("Import Map");
        importTokens = new JMenuItem("Import Token");
        helpItem = new JMenuItem("Help");
        java.net.URL imageURL = Second.class.getResource("Owlbear.png");
        assert imageURL != null;
        owlbearIcon = new ImageIcon(imageURL);
    }

    /**
     * Creates the menus and adds action listeners to menu items.
     */
    private void createMenus() {
        importMap.addActionListener(this);
        importTokens.addActionListener(this);
        helpItem.addActionListener(this);
        mapMenu.setMnemonic(KeyEvent.VK_M);
        importMap.setMnemonic(KeyEvent.VK_I);
        tokenMenu.setMnemonic(KeyEvent.VK_T);
        importTokens.setMnemonic(KeyEvent.VK_I);
        helpMenu.setMnemonic(KeyEvent.VK_H);
        menuBar.add(mapMenu);
        mapMenu.add(importMap);
        menuBar.add(tokenMenu);
        tokenMenu.add(importTokens);
        menuBar.add(helpMenu);
        helpMenu.add(helpItem);
    }

    /**
     * Creates the main frame of the application and sets its properties.
     */
    private void createFrame() {
        secondFrame.setLayout(null);
        secondFrame.setIconImage(owlbearIcon.getImage());
        secondFrame.setTitle("Rodeo");
        secondFrame.setJMenuBar(menuBar);
        secondFrame.setSize(800, 500);
        secondFrame.setLocationRelativeTo(null);
        secondFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        secondFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        secondFrame.setVisible(true);
    }

    /**
     * Makes a given label draggable by adding mouse listeners to it.
     * The label can be moved by dragging it with the mouse.
     *
     * @param label The label to make draggable.
     */
    private void makeLabelDraggable(JLabel label) {
        label.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                label.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
            }

            public void mouseReleased(MouseEvent e) {
                label.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
        });

        label.addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                int dx = e.getX() - label.getWidth() / 2;
                int dy = e.getY() - label.getHeight() / 2;
                label.setLocation(label.getX() + dx, label.getY() + dy);
            }
        });
    }

    /**
     * Creates a JPanel containing the help information to be displayed
     * in the help dialog.
     *
     * @return The help panel with the instructions.
     */
    private JPanel getHelpPanel() {
        JPanel helpPanel = new JPanel();
        JLabel helpLabel = new JLabel("<html>Map Menu:<br/> " +
                "If you click or press ALT + M, Map menu will open and there you can find Import Map.<br/><br/>" +
                "Import Map:<br/>" +
                "If you click or press I, a Map will be imported. Please be sure you had imported a good quality map or else" +
                "there will be some terrible resolution.<br/><br/>" + "Token Menu:<br/>" +
                "If you click or press ATL + T, a Token menu will open and there you can find Import Token.<br/><br/>" +
                "Import Tokens:<br/>" + "If you click or press I, a Token will be imported. Unfortunately I was unable" +
                "to make it visible at the moment of the import, so bear whit me and just click on window mode.<br/>" +
                "Then you will be able to see your token. I will" +
                "try to fix this, but at the moment it is such a mess. I will need to rewrite it all.");
        helpLabel.setForeground(new Color(0, 20, 50));
        helpLabel.setFont(new Font("", Font.PLAIN, 15));
        helpPanel.add(helpLabel);

        return helpPanel;
    }

    /**
     * Handles the action events from menu items.
     *
     * @param e The action event that occurred.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == importMap) {
            JFileChooser mapChooser = new JFileChooser();
            mapChooser.addChoosableFileFilter(new ImageFilter());
            mapChooser.setAcceptAllFileFilterUsed(false);

            int response = mapChooser.showOpenDialog(null);

            if (response == JFileChooser.APPROVE_OPTION) {
                File mapFile = mapChooser.getSelectedFile();

                try {
                    BufferedImage mapImage = ImageIO.read(mapFile);
                    secondFrame.setContentPane(new ImagePanel(mapImage));
                    secondFrame.revalidate();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        } else if (e.getSource() == importTokens) {
            JFileChooser tokenChooser = new JFileChooser();
            tokenChooser.addChoosableFileFilter(new ImageFilter());
            tokenChooser.setAcceptAllFileFilterUsed(false);

            int response = tokenChooser.showOpenDialog(Second.this);

            if (response == JFileChooser.APPROVE_OPTION) {
                File tokenFile = tokenChooser.getSelectedFile();
                ImageIcon tokenIcon = new ImageIcon(tokenFile.getAbsolutePath());
                Image tmpImage = tokenIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                tokenIcon = new ImageIcon(tmpImage);
                tokenLabel = new JLabel(tokenIcon);
                tokenLabel.setBounds(100, 100, tokenIcon.getIconWidth(), tokenIcon.getIconHeight());
                arrayOfLabels.add(tokenLabel);
                secondFrame.add(tokenLabel);
                revalidate();
                repaint();

                makeLabelDraggable(tokenLabel);
            }
        } else if (e.getSource() == helpItem) {
            JOptionPane.showMessageDialog(null, getHelpPanel(), "Help", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
