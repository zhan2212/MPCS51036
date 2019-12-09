package _05dice.P11_9;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;


public class CircleFrame extends JFrame {


private static final int FRAME_WIDTH = 300;
private static final int FRAME_HEIGHT = 400;
private CircleComponent scene;
private int flag  = 0;
private int centerX;
private int centerY;

class MousePressListener  implements MouseListener {

public void mousePressed(MouseEvent event) {
        if(flag ==  0) {
                // first click
                // save the center position
                centerX = event.getX();
                centerY = event.getY();
                flag = 1;
        } else if (flag == 1){
                // second click
                int x = event.getX();
                int y = event.getY();
                // compute the radius
                int radius = (int) Math.sqrt((x-centerX)*(x-centerX) + (y-centerY)*(y-centerY));
                // plot the circle
                scene.moveCircleTo(centerX, centerY, radius);
                flag = 0;
        }
}

public void mouseReleased(MouseEvent event) {}
public void mouseClicked(MouseEvent event) {}
public void mouseEntered(MouseEvent event) {}
public void mouseExited(MouseEvent event) {}
        }

public CircleFrame(){
        scene = new CircleComponent();
        add(scene);
        MouseListener listener = new MousePressListener();
        scene.addMouseListener(listener);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        }
}
