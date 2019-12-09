package _01control;

import java.util.Scanner;

public class P3_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Numer: ");
        int num = Integer.parseInt(in.next());
        String res = "";

        while(num >= 1000){
                res = res + "M";
                num = num - 1000;
        }
        if(num >= 900){
            num = num - 900;
            res = res + "CM";
        }
        if(num >= 500){
            num = num - 500;
            res = res + "D";
        }
        if(num >= 400){
            num = num - 400;
            res = res + "CD";
        }

        while(num >= 100){
            res = res + "C";
            num = num - 100;
        }
        if(num >= 90){
            num = num - 90;
            res = res + "XC";
        }
        if(num >= 50){
            num = num - 50;
            res = res + "L";
        }
        if(num >= 40){
            num = num - 40;
            res = res + "XL";
        }


        while(num >= 10){
            res = res + "X";
            num = num - 10;
        }
        if(num >= 9){
            num = num - 9;
            res = res + "IX";
        }
        if(num >= 5){
            num = num - 5;
            res = res + "V";
        }
        if(num >= 4){
            num = num - 4;
            res = res + "IV";
        }

        while(num >= 1){
            res = res + "I";
            num = num - 1;
        }
        System.out.print("Roman number: " + res);
    }
}
