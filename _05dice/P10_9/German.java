package _05dice.P10_9;

import java.awt.*;
import javax.swing.JComponent;

public class German extends JComponent
{
    public void paintComponent(Graphics g)
    {
        // draw black rectangle
        g.setColor(Color.BLACK);
        g.fillRect(100, 100, 120, 30);

        // draw red rectangle
        g.setColor(Color.RED);
        g.fillRect(100, 130, 120, 30);

        // draw yellow rectangle
        g.setColor(Color.YELLOW);
        g.fillRect(100, 160, 120, 30);
    }
}
