package _04interfaces.P9_6;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Appointment[] apt = new Appointment[5];
        apt[0] = new Daily("go to school",2019,9,1);
        apt[1] = new Monthly("do math homework",2019,11,1);
        apt[2] = new OneTime("take exam",2019,11,19);
        apt[3] = new Daily("go to gym",2019,11,5);
        apt[4] = new OneTime("meet advisor",2019,11,15);

        Scanner in = new Scanner(System.in);
        System.out.print("Year: ");
        int year = in.nextInt();
        System.out.print("Month: ");
        int month = in.nextInt();
        System.out.print("Day: ");
        int day = in.nextInt();

        for(int i=0; i<apt.length; i++){
            if(apt[i].occursOn(year,month,day)){
                System.out.println(apt[i].getAdescription()); // check if there is an appointment
            }
        }

    }
}
