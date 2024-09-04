import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int secondInt;
        double secondDouble;
        String secondString;

        /* Read and save an integer, double, and String to your variables. */
        secondInt = scan.nextInt();
        secondDouble = scan.nextDouble();
        scan.nextLine();  // Consume the newline character left by nextDouble()
        secondString = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + secondInt);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + secondDouble);

        /* Concatenate and print the String variables on a new line; 
            the 's' variable above should be printed first. */
        System.out.println(s + secondString);
        scan.close();
    }
}