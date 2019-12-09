package _06design.E12_4;

import java.util.ArrayList;
import java.util.Random;

public class addGenerator {
    private int target;
    public addGenerator(int targetSum){
        target = targetSum; // read a target sum
    }

    public ArrayList<Integer> generate(){
        ArrayList<Integer> integers = new ArrayList<Integer>(0); // generate integers add up to target
        Random rand = new Random(); ;// randomly generator
        while(target > 0){

            int curr = rand.nextInt(Math.min(target+1,9));
            target -= curr;
            integers.add(curr);
        }
        return integers;
    }
}
