import java.util.*;
import java.io.*;

class Solution {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();  // Number of queries
        
        // Loop through each query
        for(int i = 0; i < t; i++){
            int a = in.nextInt();  
            int b = in.nextInt();  
            int n = in.nextInt(); 
            
            int currentValue = a;  // Initialize current value with 'a'
            
            // Create a StringBuilder to store the series
            StringBuilder series = new StringBuilder();
            
            // Generate each term of the series
            for(int j = 0; j < n; j++) {
                // Add the 2^j * b value to the current value
                currentValue += b * (1 << j);  // (1 << j) is same as Math.pow(2, j)
                // Append the current value to the series
                series.append(currentValue).append(" ");
            }
            
            // Print the generated series (remove trailing space using trim)
            System.out.println(series.toString().trim());
        }
        
        in.close();
    }
}
