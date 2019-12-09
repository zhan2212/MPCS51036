package _06design.E12_4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class teachTool {
    private int level;
    private int score;

    public teachTool(){
        level = 1;
        score = 0;
    }

    public void teach(){
        Random rnd = new Random();

        System.out.println("Level 1:");
        while(score < 5){
            // level 1
            int targetSum = rnd.nextInt(10);
            addGenerator addG = new addGenerator(targetSum);
            ArrayList<Integer> integers = addG.generate(); // generate a set of nunmbers
            String s = "";
            for(int i = 0;i < integers.size();i++){
                s += Integer.toString(integers.get(i));
                if(i < integers.size()-1){
                    s += " + ";
                }
            }
            System.out.println(s + " = ?");
            Scanner sc = new Scanner(System.in);
            int ans = sc.nextInt(); // get the student's answer
            if(ans == targetSum){
                score += 1;
                System.out.println("Correct!");
                System.out.println("Current score: " + score);
            }
            else{
                System.out.println("Wrong!");
                System.out.println("Current score: " + score);
            }
        }
        System.out.println("Level up!");
        System.out.println("Level 2:");
        score = 0;

        while(score < 5){
            // level 2
            int targetSum = rnd.nextInt(50);
            addGenerator addG = new addGenerator(targetSum);
            ArrayList<Integer> integers = addG.generate(); // generate a set of nunmbers
            String s = "";
            for(int i = 0;i < integers.size();i++){
                s += Integer.toString(integers.get(i));
                if(i < integers.size()-1){
                    s += " + ";
                }
            }
            System.out.println(s + " = ?");
            Scanner sc = new Scanner(System.in);
            int ans = sc.nextInt(); // get the student's answer
            if(ans == targetSum){
                score += 1;
                System.out.println("Correct!");
                System.out.println("Current score: " + score);
            }
            else{
                System.out.println("Wrong!");
                System.out.println("Current score: " + score);
            }
        }

        System.out.println("Level up!");
        System.out.println("Level 3:");
        score = 0;

        while(score < 5){
            // level 3
            int targetdiff = rnd.nextInt(10);
            subGenerator addG = new subGenerator(targetdiff);
            ArrayList<Integer> integers = addG.generate(); // generate a set of numbers

            int total = integers.get(integers.size()-1); // the number to be subtracted

            String s = Integer.toString(total);
            for(int i = 0;i < integers.size()-1;i++){
                s += " - " + integers.get(i);
            }
            System.out.println(s + " = ?");
            Scanner sc = new Scanner(System.in);
            int ans = sc.nextInt(); // get the student's answer
            if(ans == targetdiff){ // if correct
                score += 1;
                System.out.println("Correct!");
                System.out.println("Current score: " + score);
            }
            else{ // if wrong
                System.out.println("Wrong!");
                System.out.println("Current score: " + score);
            }
        }
        System.out.println("Win!!!");

    }

}
