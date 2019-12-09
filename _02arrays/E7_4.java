package _02arrays;

import java.io.*;
import java.util.Scanner;

public class E7_4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        System.out.print("Input filename: (e.g. in) ");
        String inFilename = in.next(); // set input file name
        System.out.print("Output filename: (e.g. out) ");
        String outFilename = in.next(); // set output file name

        Scanner file = new Scanner(new File("zhan2212/src/_02arrays/"+inFilename+".txt"));
        //scan the input file

        PrintWriter out = new PrintWriter("zhan2212/src/_02arrays/"+outFilename+".txt");
        // define the output file

        int lineNumber = 1; // track the line number
        while(file.hasNextLine()){
            // write into the output file
            String line = file.nextLine();
            System.out.println(line);
            out.write("/* "+lineNumber+" */ "+line);
            out.println();
            lineNumber += 1;
        }
        out.close();


    }
}
