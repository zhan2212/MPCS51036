package _01control;
import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class E2_4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("The first integer: ");
        int val1 = Integer.parseInt(in.next());
        System.out.print("The second integer: ");
        int val2 = Integer.parseInt(in.next());

        System.out.println("Sum: " + Sum(val1,val2));
        System.out.println("Difference: " + Diff(val1,val2));
        System.out.println("Product: " + Prod(val1,val2));
        System.out.println("Average: " + Avg(val1,val2));
        System.out.println("Distance: " + Distance(val1,val2));
        System.out.println("Maximum: " + Maxi(val1,val2));
        System.out.println("Minimum: " + Mini(val1, val2));


    }
    private static int Sum(int val1, int val2){
        return (val1 + val2);
    }

    private static int Diff(int val1, int val2){
        return (val1 - val2);
    }

    private static int Prod(int val1, int val2){
        return (val1 * val2);
    }

    private static double Avg(int val1, int val2){
        double res = (val1+val2)/2.0;
        return res;
    }

    private static int Distance(int val1, int val2){
        return Math.abs(val1 - val2);
    }

    private static int Maxi(int val1, int val2){
        return Math.max(val1, val2);
    }

    private static int Mini(int val1, int val2){
        return Math.min(val1, val2);
    }
}
