/**
 * The ImagePanel is a graphic class that uses the graphic components to draw the BufferedImage.
 * It draws the image as it is set and cus of that lets the user see the Image.
 */

package Window;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ImagePanel extends JComponent {
    private final BufferedImage bufferedImage;

    /**
     * Constructs an ImagePanel with the specified BufferedImage.
     *
     * @param bufferedImage the image to be displayed on the panel
     */
    public ImagePanel(BufferedImage bufferedImage) {
        this.bufferedImage = bufferedImage;
    }

    /**
     * Overrides the paintComponent method to draw the image on the panel.
     *
     * @param graphics the Graphics object used for painting
     */
    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.drawImage(bufferedImage, 100, 15, 1320, 740, null);
    }
}
