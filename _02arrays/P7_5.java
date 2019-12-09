package _02arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P7_5 {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "zhan2212/src/_02arrays/sample.csv";
        Scanner file = new Scanner(new File(path));
        // load csv file
        System.out.println("Load CSV file from: " + path);
        System.out.println("The number of rows: "+numberOfRows(file));
        file = new Scanner(new File(path));

        Scanner in = new Scanner(System.in);
        System.out.print("Row: ");
        int row1 = in.nextInt();
        System.out.println("The number of fields at row "+row1+": " + numberOfFields(file,row1));

        System.out.print("Row: ");
        int row2 = in.nextInt();
        System.out.print("Column: ");
        int col = in.nextInt();
        file = new Scanner(new File(path));
        System.out.println("The field at row "+row2+" column "+col+": " + field(file,row2,col));

    }
    public static int numberOfRows(Scanner file){
        int num = 0;
        while(file.hasNextLine()){
            String line = file.nextLine();
            num += 1;
        }
        return num;
    }

    public static int numberOfFields(Scanner file, int row){
        int lineIndx = 0;
        String s = new String();
        while(file.hasNextLine()){
            // read string from a specific line
            s = file.nextLine();
            if(lineIndx==row){
                break;
            }
            lineIndx += 1;
        }

        int num = 1; //count number of comma
        int quotation = 0; // count number of quotation
        int i = 0;
        while(i < s.length()) {
            if(s.charAt(i) == ',' && quotation ==0){
                // if the comma is not inside quatations
                num += 1;
            }
            else if(s.charAt(i) == '"' && quotation == 0){
                // if quotation mark detected
                quotation += 1;
            }
            else if(s.charAt(i) == '"' && quotation == 1){
                if(s.charAt(i+1) != '"'){
                    // if quotation ends
                    quotation -= 1;
                }
                else{
                    // if there is an inner quotation
                    quotation += 1;
                    i += 1;
                }
            }
            else if(s.charAt(i) == '"' && quotation == 2){
                // if inner quotation ends
                quotation -= 1;
                i += 1;
            }
            i += 1;
        }
        return num;
    }
    public static String field(Scanner file, int row, int column){
        int lineIndx = 0;
        String s = new String();
        while(file.hasNextLine()){
            // read string from a specific line
            s = file.nextLine();
            if(lineIndx==row){
                break;
            }
            lineIndx += 1;
        }

        String res  = "";
        int colIndx = 0; //count number of comma
        int quotation = 0; // count number of quotation
        int i = 0;
        while(i < s.length()) {
            if(colIndx == column && s.charAt(i) !=','){
                // get the field at a specific position
                res += s.charAt(i);
            }
            if(s.charAt(i) == ',' && quotation ==0){
                // if the comma is not inside quatations
                colIndx += 1;
            }
            else if(s.charAt(i) == '"' && quotation == 0){
                // if quotation mark detected
                quotation += 1;
            }
            else if(s.charAt(i) == '"' && quotation == 1){
                if(s.charAt(i+1) != '"'){
                    // if quotation ends
                    quotation -= 1;
                }
                else{
                    // if there is an inner quotation
                    quotation += 1;
                    i += 1;
                }
            }
            else if(s.charAt(i) == '"' && quotation == 2){
                // if inner quotation ends
                quotation -= 1;
                i += 1;
            }

            i += 1;
        }
        return res;
    }

}
