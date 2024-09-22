import java.util.*;
import java.io.*;

class Solution {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();  // Number of queries
    
        for(int i = 0; i < t; i++){
            int a = in.nextInt();  
            int b = in.nextInt();  
            int n = in.nextInt(); 
            
            int currentValue = a;
            
            // Create a StringBuilder to store the series
            StringBuilder series = new StringBuilder();
            
            // Generate each term of the series
            for(int j = 0; j < n; j++) {
                currentValue += b * (1 << j);
                // Append the current value to the series
                series.append(currentValue).append(" ");
            }
            System.out.println(series.toString().trim());
        }
        
        in.close();
    }
}
