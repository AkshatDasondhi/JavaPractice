package JavaBeans;

import java.awt.*;
import javax.swing.*;

public class CustomComponent extends JComponent {
    private int x, y, width, height;
    private Color color;

    public CustomComponent() {
        x = 0;
        y = 0;
        width = 50;
        height = 50;
        color = Color.RED;
    }

    public int getx() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
        repaint();
    }

    public int gety() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
        repaint();
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
        repaint();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
        repaint();
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        repaint();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(width, height);
    }

    @Override 
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
