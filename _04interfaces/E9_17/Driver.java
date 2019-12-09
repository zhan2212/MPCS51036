package _04interfaces.E9_17;

import static _04interfaces.E9_17.Measurable.average;

public class Driver {
    public static void main(String[] args) {
        Measurable[] cans = new Measurable[3];
        SodaCan can = new SodaCan(2,3);
        System.out.println("The surface area is: "+can.getSurfaceArea());
        cans[0] = can; // set the first can

        can = new SodaCan(4,5);
        System.out.println("The surface area is: "+can.getSurfaceArea());
        cans[1] = can; // set the second can

        can = new SodaCan(6,2);
        System.out.println("The surface area is: "+can.getSurfaceArea());
        cans[2] = can; // set the third can

        System.out.println("Average surface area is : " + average(cans)); // compute the average surface area
    }
}
