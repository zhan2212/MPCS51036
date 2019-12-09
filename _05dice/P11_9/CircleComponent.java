package _05dice.P11_9;

import javax.swing.*;
import java.awt.*;

public class CircleComponent extends JComponent {
private int radius;
private int centerX;
private int centerY;

public CircleComponent(){
    centerX = 0;
    centerY = 0;
    }

public void paintComponent(Graphics g){
    // compute the start position of circle based on its center position
    int x = centerX-radius;
    int y = centerY-radius;
    // plot the circle
    g.drawOval(x,y,2*radius,2*radius);
}

public void moveCircleTo(int x, int y, int r){
    // update the value
    centerX = x;
    centerY = y;
    radius = r;
    repaint();
}
}
