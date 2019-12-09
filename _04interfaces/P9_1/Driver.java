package _04interfaces.P9_1;

import sun.awt.geom.AreaOp;

public class Driver {
    public static void main(String[] args) {
        // normal clock
        Clock clk = new Clock();
        System.out.println("Hour: " + clk.getHours());
        System.out.println("Minute: " + clk.getMinutes());
        System.out.println("Time: " + clk.getTime());

        // world clock with 3 time zones ahead
        WorldClock newClk =new WorldClock(3);
        System.out.println("Hour: " + newClk.getHours());
        System.out.println("Minute: " + newClk.getMinutes());
        System.out.println("Time: " + newClk.getTime());

    }
}
