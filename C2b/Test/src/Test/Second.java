package Test;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Second extends JFrame implements ActionListener
{
    private JFrame secondFrame;
    private ArrayList<JLabel> tokenLabels;
    private JLabel tokenLabel;
    private JMenuBar menuBar;
    private JMenu mapMenu, tokenMenu, helpMenu;
    private JMenuItem importMap, importTokens;
    private ImageIcon imageIcon;

    public Second()
    {
        initializeComponents();
        createMenus();
        createFrame();
    }

    private void initializeComponents()
    {
        secondFrame = new JFrame();
        tokenLabel = new JLabel();
        tokenLabels = new ArrayList<>();
        menuBar = new JMenuBar();
        mapMenu = new JMenu("Map");
        tokenMenu = new JMenu("Tokens");
        helpMenu = new JMenu("Help");
        importMap = new JMenuItem("Import Map");
        importTokens = new JMenuItem("Import Token");
        java.net.URL imageURL = Second.class.getResource("Owlbear.png");
        assert imageURL != null;
        imageIcon = new ImageIcon(imageURL);
    }

    private void createMenus()
    {
        importMap.addActionListener(this);
        importTokens.addActionListener(this);
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
    }

    private void createFrame()
    {
        secondFrame.setLayout(null);
        secondFrame.setIconImage(imageIcon.getImage());
        secondFrame.setTitle("Rodeo");
        secondFrame.setJMenuBar(menuBar);
        secondFrame.setSize(800, 500);
        secondFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        secondFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        secondFrame.setVisible(true);
    }

    private void makeLabelDraggable(JLabel label)
    {
        label.addMouseListener(new MouseAdapter()
        {
            public void mousePressed(MouseEvent e)
            {
                label.setOpaque(false);//It was for knowing if the mouse press works. So it can be turned off
                label.setBackground(Color.LIGHT_GRAY);
                label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                label.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
            }

            public void mouseReleased(MouseEvent e)
            {
                label.setOpaque(false);
                label.setBorder(null);
                label.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
        });

        label.addMouseMotionListener(new MouseAdapter()
        {
            public void mouseDragged(MouseEvent e)
            {
                int dx = e.getX() - label.getWidth() / 2;
                int dy = e.getY() - label.getHeight() / 2;
                label.setLocation(label.getX() + dx, label.getY() + dy);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == importMap)
        {
            JFileChooser mapChooser = new JFileChooser();
            mapChooser.addChoosableFileFilter(new ImageFilter());
            mapChooser.setAcceptAllFileFilterUsed(false);

            int response = mapChooser.showOpenDialog(null);

            if (response == JFileChooser.APPROVE_OPTION)
            {
                File mapFile = mapChooser.getSelectedFile();

                try
                {
                    BufferedImage mapImage = ImageIO.read(mapFile);
                    secondFrame.setContentPane(new ImagePanel(mapImage));
                    secondFrame.revalidate();
                }
                catch (IOException ex)
                {
                    ex.printStackTrace();
                }
            }
        }
        else if (e.getSource() == importTokens)
        {
            JFileChooser tokenChooser = new JFileChooser();
            tokenChooser.addChoosableFileFilter(new ImageFilter());
            tokenChooser.setAcceptAllFileFilterUsed(false);

            int response = tokenChooser.showOpenDialog(Second.this);

            if (response == JFileChooser.APPROVE_OPTION)
            {
                File tokenFile = tokenChooser.getSelectedFile();
                ImageIcon tokenIcon = new ImageIcon(tokenFile.getAbsolutePath());
                Image tmpImage = tokenIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                tokenIcon = new ImageIcon(tmpImage);
                tokenLabel = new JLabel(tokenIcon);
                tokenLabel.setBounds(100, 100, tokenIcon.getIconWidth(), tokenIcon.getIconHeight());
                tokenLabels.add(tokenLabel);
                secondFrame.add(tokenLabel);
                revalidate();
                repaint();

                makeLabelDraggable(tokenLabel);
            }
        }
        else if (e.getSource() == helpMenu)
        {
            // Handle help menu action
        }
    }
}
