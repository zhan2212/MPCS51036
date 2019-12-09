package _01control;

import java.util.Scanner;

public class P3_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Income: ");
        int income = Integer.parseInt(in.next());
        double tax = 0;

        if(income < 50000){
            tax = income * 0.01;
        }
        else if (income < 75000){
            tax = 500 + (income-50000) * 0.02;
        }
        else if (income < 100000){
            tax = 1000 + (income-75000) * 0.03;
        }
        else if (income < 250000){
            tax = 1750 + (income - 100000) * 0.04;
        }
        else if (income < 500000){
            tax = 7750 + (income-250000) * 0.05;
        }
        else {
            tax = 20250 + (income-500000) * 0.06;
        }
        System.out.print("Tax: " + tax);
    }
}
