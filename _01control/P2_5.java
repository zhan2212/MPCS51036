package _01control;

import java.util.Scanner;

public class P2_5 {
    public static void main(String[] args) {
        System.out.print("Price: ");
        Scanner in  = new Scanner(System.in);
        float price = Float.parseFloat(in.next());

        int dollar = (int) price;
        float cent = (float) ((price - (float) dollar)*100 + 0.5);
        int intCent = (int) cent;

        System.out.println("Dollar: " + dollar);
        System.out.println("Cent: " + intCent);

    }
}
