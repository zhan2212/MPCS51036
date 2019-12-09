package _05dice.P10_9;

import java.awt.*;
import javax.swing.JComponent;

public class Hungarian extends JComponent
{
    public void paintComponent(Graphics g)
    {
        // draw red rectangle
        g.setColor(Color.red);
        g.fillRect(100, 100, 120, 30);

        // draw black lines
        g.setColor(Color.BLACK);
        g.drawLine(100, 130, 100, 160);
        g.drawLine(220, 130, 220, 160);

        // draw green rectangle
        g.setColor(Color.GREEN);
        g.fillRect(100, 160, 120, 30);
    }
}