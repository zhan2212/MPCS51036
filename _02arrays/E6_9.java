package _02arrays;

import java.util.Arrays;

public class E6_9 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        int b[] = {1,2,3,4,5,6};
        System.out.print("array a is: "+ Arrays.toString(a));
        System.out.println();
        System.out.print("array b is: "+ Arrays.toString(b));
        System.out.println();
        System.out.print("equal? " + equals(a,b));

    }
    public static boolean equals(int[] a, int[] b){
        if(a.length != b.length){
            // if the length is different, must be false
            return false;
        }
        for(int i = 0; i<a.length; i++){
            // compare each element in a and b in order
            if(a[i] != b[i]){
                    return false;
            }
        }
        return true;
    }
}
