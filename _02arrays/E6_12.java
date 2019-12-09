package _02arrays;

import java.util.Arrays;
import java.util.Random;

public class E6_12 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            // generate an array with 20 random numbers ranging from 0 to 99
            arr[i] = rnd.nextInt(100);
        }
        System.out.print("Random array: " + Arrays.toString(arr));
        System.out.println();
        Arrays.sort(arr);
        System.out.print("Sorted random array: " + Arrays.toString(arr));
        System.out.println();
    }
}
