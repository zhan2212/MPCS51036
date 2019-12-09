package _02arrays;

import java.util.Random;

public class E6_1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rnd = new Random();
        System.out.print("Random numbers:");
        for(int i= 0; i<arr.length;i++){
            // generate arry with random numbes
            arr[i] = rnd.nextInt();
            System.out.print(arr[i]+"||");
        }
        System.out.println();

        evenIndex(arr);
        evenNum(arr);
        reverseOrder(arr);
        firstLast(arr);
    }
    public static void evenIndex(int[] arr){
        System.out.print("Every element at an even index: ");
        for( int i = 0; i < arr.length; i += 2) {
            // determine if the index is even
            System.out.print(arr[i]+"||");
        }
        System.out.println();
    }
    public static void evenNum(int[] arr){
        // determine if the number is even
        System.out.print("Every even element: ");
        for( int i = 0; i < arr.length; i ++) {
            if(arr[i]%2 == 0) {
                System.out.print(arr[i]+"||");
            }
        }
        System.out.println();
    }
    public static void reverseOrder(int[] arr){
        // reverse the array
        System.out.print("All elements in reverse order: ");
        for( int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+"||");
        }
        System.out.println();
    }
    public static void firstLast(int[] arr){
        // find the first and last element
        System.out.print("Only the first and last element: ");
        System.out.print(arr[0]+"||");
        System.out.print(arr[arr.length-1]+"||");
        System.out.println();
    }
}
