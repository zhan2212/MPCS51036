package _01control;

import java.util.Scanner;

public class E4_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number: ");
        int number = in.nextInt();

        String res = "";

        System.out.println("The binary digits of " + number + " is: ");
        while(number > 0){
            res = (number%2) + res;
            number = number / 2;
        }
        System.out.print(res);

    }
}
