package Window;

import javax.swing.border.Border;
import java.awt.*;

public class RoundBorder implements Border {
    private final int radius;

    /**
     * Constructs a RoundBorder with the specified radius.
     *
     * @param radius the radius of the rounded corners
     */
    public RoundBorder(int radius) {
        this.radius = radius;
    }

    /**
     * Paints the border with rounded corners.
     *
     * @param c      the component being painted
     * @param g      the Graphics object used for painting
     * @param x      the x-coordinate of the border's top-left corner
     * @param y      the y-coordinate of the border's top-left corner
     * @param width  the width of the border
     * @param height the height of the border
     */
    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
    }

    /**
     * Retrieves the insets of the border.
     *
     * @param c the component for which the insets are calculated
     * @return the insets of the border
     */
    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius + 2, this.radius + 100, this.radius + 1, this.radius + 100);
    }

    /**
     * Checks if the border is opaque.
     *
     * @return true if the border is opaque, false otherwise
     */
    @Override
    public boolean isBorderOpaque() {
        return true;
    }
}
