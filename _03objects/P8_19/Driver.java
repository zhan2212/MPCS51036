package _03objects.P8_19;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Cannonball cn = new Cannonball(0);
        Scanner in = new Scanner(System.in);
        System.out.print("The start angle is: ");
        double alpha = in.nextDouble(); // input angle
        System.out.print("The initial velocity is: ");
        double velocity = in.nextDouble(); // input velocity
        cn.shoot(alpha,velocity);
    }
}
