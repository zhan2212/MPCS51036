package _01control;

import java.util.Scanner;

public class E2_6 {
    public static void main(String[] args) {
        System.out.print("A measurement in meters: ");
        Scanner in = new Scanner(System.in);
        float val = Float.parseFloat(in.next());

        System.out.println("A measurement in miles: " + val * 0.00062137);
        System.out.println("A measurement in feet: " + val * 3.2808);
        System.out.println("A measurement in inches: " + val * 39.370);
    }
}
