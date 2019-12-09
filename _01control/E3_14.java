package _01control;

import java.util.Scanner;

public class E3_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner((System.in));
        System.out.print("Month:");
        int month = Integer.parseInt(in.next());
        System.out.print("Day:");
        int day = Integer.parseInt(in.next());
        String season = null;

        if (month == 1 || month == 2 || month == 3){
            season = "Winter";
        }
        else if (month == 4 || month == 5 || month == 6){
            season = "Spring";
        }
        else if (month == 7 || month == 8 || month == 9){
            season = "Summer";
        }
        else if (month == 10 || month == 11 || month == 12){
            season = "Fall";
        }
        if (month % 3 == 0 && day >= 21){
            if(season == "Winter"){
                season = "Spring";
            }
            else if (season == "Spring"){
                season = "Summer";
            }
            else if (season == "Summer"){
                season = "Fall";
            }
            else {
                season = "Winter";
            }
        }
        System.out.print(season);

    }
}
