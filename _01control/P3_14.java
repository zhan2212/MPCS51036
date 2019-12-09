package _01control;

import java.util.Scanner;

public class P3_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Year: ");
        int year = Integer.parseInt(in.next());
        boolean leap;

        if(year % 400 == 0){
            System.out.print("Year " + year + " is leap year.");
        }
        else if (year % 100 == 0){
            System.out.print("Year " + year + " is not leap year.");
        }
        else if (year % 4 == 0){
            System.out.print("Year " + year + " is leap year.");
        }
        else{
            System.out.print("Year " + year + " is not leap year.");
        }
    }
}
