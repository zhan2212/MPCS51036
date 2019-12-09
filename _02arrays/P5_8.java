package _02arrays;

import java.util.Scanner;

public class P5_8 {
    public static void main(String[] args) {
        System.out.print("Year:");
        Scanner in = new Scanner(System.in);
        int year = Integer.parseInt(in.next());
        System.out.print(isLeapYear(year));

    }
    public static boolean isLeapYear(int year){
        // determine if year is leap year
        if(year % 400 == 0){
            // can be divided by 400
            return true;
        }
        if (year % 100 == 0){
            // can be divided by 100
            return false;
        }
        if (year % 4 == 0){
            // can be divided by 4
            return true;
        }

        return false;

    }
}
