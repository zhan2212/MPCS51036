package _05dice.P10_10;

import java.awt.*;
import javax.swing.JComponent;

public class DrawRing extends JComponent
{
    public void paintComponent(Graphics g)
    {
        // draw blue circles
        g.setColor(Color.BLUE);
        g.drawOval(100,100,55,55);

        // draw black circles
        g.setColor(Color.BLACK);
        g.drawOval(160,100,55,55);

        // draw red circles
        g.setColor(Color.RED);
        g.drawOval(220,100,55,55);

        // draw yellow circles
        g.setColor(Color.YELLOW);
        g.drawOval(130,125,55,55);

        // draw green circles
        g.setColor(Color.GREEN);
        g.drawOval(190,125,55,55);
    }
}