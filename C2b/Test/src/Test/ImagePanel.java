package Test;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ImagePanel extends JComponent
{
    private final BufferedImage bufferedImage;

    public ImagePanel(BufferedImage bufferedImage)
    {
        this.bufferedImage = bufferedImage;
    }

    @Override
    public void paintComponent(Graphics graphics)
    {
        super.paintComponent(graphics);
        graphics.drawImage(bufferedImage, 100, 15, 1320, 740, null);
    }
}

