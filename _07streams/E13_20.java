package _07streams;

import java.util.ArrayList;
import java.util.List;

public class E13_20 {
    public static void main(String[] args) {
        List<Integer> availBills = new ArrayList<Integer>(4); //available bills
        availBills.add(100);
        availBills.add(20);
        availBills.add(5);
        availBills.add(1);

        System.out.println("All the payment combination of $20 is: ");
        payBill(20, "", availBills);
        System.out.println("All the payment combination of $34 is: ");
        payBill(34, "", availBills);
        System.out.println("All the payment combination of $16 is: ");
        payBill(13, "", availBills);
    }

    public static void payBill(int num, String currBills, List<Integer> avail){
        if(num == 0){
            // base case, there is no money to pay
            System.out.println(currBills);
        }
        for(int i = 0; i < avail.size(); i ++){
            if(num >= avail.get(i)){
                // if the number is larger than bill, we can pay using that bill
                String nextBills =  currBills + " $" + avail.get(i) + " "; // make string
                payBill(num - avail.get(i),nextBills , avail.subList(i,avail.size()));
            }
        }



    }
}
