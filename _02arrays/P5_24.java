package _02arrays;
import java.util.*;

public class P5_24 {
    public static void main(String[] args) {
        Hashtable<Character, Integer> h = new Hashtable<>();
        // use a hash table to store the roman number and the corresponding decimal number
        h.put('I',1);
        h.put('V',5);
        h.put('X',10);
        h.put('L',50);
        h.put('C',100);
        h.put('D',500);
        h.put('M',1000);

        Scanner in = new Scanner(System.in);
        System.out.print("Roman Number:");
        String str = in.next();
        int total = 0;

        // follow the algorithm in text book
        while(!str.isEmpty()){
            if(str.length()==1 || h.get(str.charAt(0)) >= h.get(str.charAt(1))){
                total = total + h.get(str.charAt(0));
                str = str.substring(1);
            }else{
                int difference = h.get(str.charAt(1)) - h.get(str.charAt(0));
                total = total + difference;
                str = str.substring(2);
            }
        }

        System.out.print("Decimal Number:"+total);
    }
}
