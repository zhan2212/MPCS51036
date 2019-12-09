package _06design.E12_4;

import java.util.ArrayList;
import java.util.Random;

public class subGenerator {
    private int target; // targer difference, less than 10
    public subGenerator(int targetSum){
        target = targetSum; // read a target difference
    }

    public ArrayList<Integer> generate(){
        int total = target;
        ArrayList<Integer> integers = new ArrayList<Integer>(0);
        Random rand = new Random(); ;// randomly generator
        while(total < 10){
            int curr = rand.nextInt(10);
            total += curr;
            integers.add(curr);
        }
        integers.add(total - integers.get(integers.size()-1)); // compute the sum
        integers.remove(integers.size()-2); // remove the last second element

        return integers;
    }
}
