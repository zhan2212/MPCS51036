package _07streams;

public class E13_4 {
    public static void main(String[] args) {
        for(int i=1; i < 30; i++) {
            // test for integers form 1 to 30
            System.out.println("The binary form of integer " + i + " is " + toBinary(i));
        }


    }
    public static String toBinary(int num){
        if(num<2){
            // base case
            // when num is 0 or 1, return itself
            return Integer.toString(num);
        }
        else if(num % 2 == 1){
            // if num is odd, add 1 to the end of string
            return toBinary(num/2) + "1";
        }else{
            // if num is even, add 1 to the end of string
            return toBinary(num/2) + "0";
        }

    }
}
