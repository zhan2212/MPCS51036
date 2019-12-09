package _02arrays;

import java.util.Arrays;
import java.util.Scanner;

public class E6_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter sequence (e.g 1 2 3 4 5): ");
        String sequence = in.nextLine(); // read string from inout
        String[] strArr = sequence.split(" "); // split string into string array
        int[] intArr = new int[strArr.length];
        double maxVal = 0;
        for(int i = 0;i < strArr.length;i++)
        {
            intArr[i] = Integer.parseInt(strArr[i]); // convert element to integer
            maxVal = Math.max(maxVal,intArr[i]);
        }
        System.out.print(Arrays.toString(intArr));
        System.out.println();
        System.out.println("Bar chart:");
        barChart(intArr,maxVal);
    }
    public static void barChart(int[] arr, double maxVal){
        // the function builds a 2D array to store "*"
        String[][] M = new String[40][arr.length];
        for(int i =0; i<40;i++){
            for(int j =0; j< arr.length;j++){
                // check if * should appear at a certain position
                if((39-i) < arr[j]/maxVal*40.0){
                    M[i][j] = "*";
                }
                else {
                    M[i][j] = " ";
                }
            }
        }
        for(int i =0; i<40;i++){
            for(int j =0; j< arr.length;j++) {
                // print out the bar chart
                System.out.print(M[i][j]);
            }
            System.out.println();
        }
    }
}
