package _05dice.P10_9;

import javax.swing.*;

public class Driver {
    public static void main(String[] args) {
        // plot German flag
        JFrame frame = new JFrame(); // set up frame
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        German comp = new German(); // make plot
        frame.add(comp);
        frame.setVisible(true);

        // plot Hungarian flag
        JFrame frame2 = new JFrame(); // set up frame
        frame2.setSize(500,500);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Hungarian comp2 = new Hungarian(); // make plot
        frame2.add(comp2);
        frame2.setVisible(true);
    }
}
