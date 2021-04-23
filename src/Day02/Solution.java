package Day02;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by Miguel Emmara
 */
public class Solution {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */

        int secondI = scan.nextInt();
        double secondD = scan.nextDouble();
        scan.nextLine();
        String secondS = scan.nextLine();

        System.out.println((secondI + i));
        System.out.println((d + secondD));
        System.out.println((s.concat(secondS)));

        scan.close();
    }
}