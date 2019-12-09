package _05dice.P10_10;

import javax.swing.*;

public class Driver {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); // set up frame
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DrawRing comp = new DrawRing(); // plot Olympics ring
        frame.add(comp);
        frame.setVisible(true);

    }
}
