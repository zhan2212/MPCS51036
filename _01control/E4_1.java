package _01control;

import com.sun.xml.internal.ws.api.client.SelectOptimalEncodingFeature;

import java.util.Scanner;

public class E4_1 {
    public static void main(String[] args) {

        System.out.println("a. The sum of all even numbers between 2 and 100: " + sumEven2to100());

        System.out.println("b. The sum of all squares between 1 and 100: " + sumOdd1to100());

        System.out.print("c. All the powers of 2 from 2^0 to 2^20: ");
        powersOf2();

        System.out.println("d. The sum of all odd numbers between a and b: " + sumAllOdd());

        System.out.println("e. The sum of all odd digits of input: " + sumAllDigits());
    }

    private static int sumEven2to100(){
        int res = 0;
        for (int i=2; i<=100; i=i+2){
            res = res + i;
        }
        return res;
    }

    private static int sumOdd1to100(){
        int res = 0;
        for (int i=1; i<=10; i++){
            res = res + i*i;
        }
        return res;
    }

    private static void powersOf2(){
        for (int i=0; i<=20; i++){
            System.out.print(Math.pow(2,i) + " ");
        }
        System.out.println();
    }

    private static int sumAllOdd(){
        int res = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("a: ");
        int a = in.nextInt();
        System.out.print("b: ");
        int b = in.nextInt();
        res = 0;
        for(int i=a; i<=b; i++){
            if (i%2 == 1){
                res = res + i;
            }
        }
        return res;
    }

    private static int sumAllDigits(){
        int res = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Input digits: ");
        String digits = in.next();
        for(int i=0; i<=digits.length()-1; i++){
            int digit = Character.getNumericValue(digits.charAt(i));
            if(digit%2 == 1){
                res =  res + digit;
            }
        }
        return res;
    }
}
